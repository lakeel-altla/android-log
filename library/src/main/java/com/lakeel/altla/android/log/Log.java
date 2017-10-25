package com.lakeel.altla.android.log;

/**
 * Defines the logger.
 */
public final class Log {

    private final String tag;

    private final LogConfig config;

    private final String className;

    Log(String tag, LogConfig config, Class<?> clazz) {
        this.tag = tag;
        this.config = config;

        if (this.config.isFullyQualifiedClassNameUsed()) {
            className = clazz.getName();
        } else {
            className = clazz.getSimpleName();
        }
    }

    /**
     * Log a message as the verbose level.
     *
     * @param message A message.
     */
    public void v(String message) {
        if (config.isVerboseEnabled()) {
            android.util.Log.v(tag, config.getFormatter().format(className, message));
        }
    }

    /**
     * Log a message as the verbose level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void v(String format, Object... args) {
        if (config.isVerboseEnabled()) {
            android.util.Log.v(tag, config.getFormatter().format(className, format, args));
        }
    }

    /**
     * Log a message as the debug level.
     *
     * @param message A message.
     */
    public void d(String message) {
        if (config.isDebugEnabled()) {
            android.util.Log.d(tag, config.getFormatter().format(className, message));
        }
    }

    /**
     * Log a message as the debug level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void d(String format, Object... args) {
        if (config.isDebugEnabled()) {
            android.util.Log.d(tag, config.getFormatter().format(className, format, args));
        }
    }

    /**
     * Log a message as the info level.
     *
     * @param message A message.
     */
    public void i(String message) {
        if (config.isInfoEnabled()) {
            android.util.Log.i(tag, config.getFormatter().format(className, message));
        }
    }

    /**
     * Log a message as the info level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void i(String format, Object... args) {
        if (config.isInfoEnabled()) {
            android.util.Log.i(tag, config.getFormatter().format(className, format, args));
        }
    }

    /**
     * Log a message as the warn level.
     *
     * @param message A message.
     */
    public void w(String message) {
        if (config.isWarnEnabled()) {
            android.util.Log.w(tag, config.getFormatter().format(className, message));
        }
    }

    /**
     * Log a message as the warn level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void w(String format, Object... args) {
        if (config.isWarnEnabled()) {
            android.util.Log.w(tag, config.getFormatter().format(className, format, args));
        }
    }

    /**
     * Log a message and a throwable object as the warn level.
     *
     * @param message   A message.
     * @param throwable A throwable object.
     */
    public void w(String message, Throwable throwable) {
        if (config.isWarnEnabled()) {
            android.util.Log.w(tag, config.getFormatter().format(className, message), throwable);
        }
    }

    /**
     * Log a message as the error level.
     *
     * @param message A message.
     */
    public void e(String message) {
        if (config.isErrorEnabled()) {
            android.util.Log.e(tag, config.getFormatter().format(className, message));
        }
    }

    /**
     * Log a message as the error level.
     *
     * @param format A format string by java printf-style.
     * @param args   Arguments referenced in the format string.
     */
    public void e(String format, Object... args) {
        if (config.isErrorEnabled()) {
            android.util.Log.e(tag, config.getFormatter().format(className, format, args));
        }
    }

    /**
     * Log a message and a throwable object as the error level.
     *
     * @param message   A message.
     * @param throwable A throwable object.
     */
    public void e(String message, Throwable throwable) {
        if (config.isErrorEnabled()) {
            android.util.Log.e(tag, config.getFormatter().format(className, message), throwable);
        }
    }
}
