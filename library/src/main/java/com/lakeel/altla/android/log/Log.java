package com.lakeel.altla.android.log;

/**
 * Defines the logger.
 */
public final class Log {

    private static final MessageBuilder BUILDER = new MessageBuilder();

    private final String mTag;

    private final LogConfig mConfig;

    private final String mClassName;

    Log(String tag, LogConfig config, Class<?> clazz) {
        mTag = tag;
        mConfig = config;

        if (mConfig.isFullyQualifiedClassNameUsed()) {
            mClassName = clazz.getName();
        } else {
            mClassName = clazz.getSimpleName();
        }
    }

    /**
     * Log a message as the verbose level.
     *
     * @param message A message.
     */
    public void v(String message) {
        if (mConfig.isVerboseEnabled()) {
            android.util.Log.v(mTag, BUILDER.build(mClassName, message));
        }
    }

    /**
     * Log a message as the verbose level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void v(String format, Object... args) {
        if (mConfig.isVerboseEnabled()) {
            android.util.Log.v(mTag, BUILDER.build(mClassName, format, args));
        }
    }

    /**
     * Log a message as the debug level.
     *
     * @param message A message.
     */
    public void d(String message) {
        if (mConfig.isDebugEnabled()) {
            android.util.Log.d(mTag, BUILDER.build(mClassName, message));
        }
    }

    /**
     * Log a message as the debug level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void d(String format, Object... args) {
        if (mConfig.isDebugEnabled()) {
            android.util.Log.d(mTag, BUILDER.build(mClassName, format, args));
        }
    }

    /**
     * Log a message as the info level.
     *
     * @param message A message.
     */
    public void i(String message) {
        if (mConfig.isInfoEnabled()) {
            android.util.Log.i(mTag, BUILDER.build(mClassName, message));
        }
    }

    /**
     * Log a message as the info level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void i(String format, Object... args) {
        if (mConfig.isInfoEnabled()) {
            android.util.Log.i(mTag, BUILDER.build(mClassName, format, args));
        }
    }

    /**
     * Log a message as the warn level.
     *
     * @param message A message.
     */
    public void w(String message) {
        if (mConfig.isWarnEnabled()) {
            android.util.Log.w(mTag, BUILDER.build(mClassName, message));
        }
    }

    /**
     * Log a message as the warn level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void w(String format, Object... args) {
        if (mConfig.isWarnEnabled()) {
            android.util.Log.w(mTag, BUILDER.build(mClassName, format, args));
        }
    }

    /**
     * Log a message and a throwable object as the warn level.
     *
     * @param message   A message.
     * @param throwable A throwable object.
     */
    public void w(String message, Throwable throwable) {
        if (mConfig.isWarnEnabled()) {
            android.util.Log.w(mTag, BUILDER.build(mClassName, message), throwable);
        }
    }

    /**
     * Log a message as the error level.
     *
     * @param message A message.
     */
    public void e(String message) {
        if (mConfig.isErrorEnabled()) {
            android.util.Log.e(mTag, BUILDER.build(mClassName, message));
        }
    }

    /**
     * Log a message as the error level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void e(String format, Object... args) {
        if (mConfig.isErrorEnabled()) {
            android.util.Log.e(mTag, BUILDER.build(mClassName, format, args));
        }
    }

    /**
     * Log a message and a throwable object as the error level.
     *
     * @param message   A message.
     * @param throwable A throwable object.
     */
    public void e(String message, Throwable throwable) {
        if (mConfig.isErrorEnabled()) {
            android.util.Log.e(mTag, BUILDER.build(mClassName, message), throwable);
        }
    }

    private static class MessageBuilder {

        private static final String BASE_FORMAT = "[%s] [%s] %s";

        String build(String className, String message) {
            return String.format(BASE_FORMAT, Thread.currentThread().getName(), className, message);
        }

        String build(String className, String format, Object... args) {
            String message = String.format(format, args);
            return String.format(BASE_FORMAT, Thread.currentThread().getName(), className, message);
        }
    }
}
