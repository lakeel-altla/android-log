package com.lakeel.altla.android.log;

/**
 * The factory of android.util.Log wrappers.
 */
public final class LogFactory {

    private static final String TAG_DEFAULT = "DEFAULT";

    private static boolean debug;

    private static String tag = TAG_DEFAULT;

    private static LogConfig debugConfig = new LogConfig.Builder().build();

    private static LogConfig releaseConfig = new LogConfig.Builder().setVerboseEnabled(false)
                                                                    .setDebugEnabled(false)
                                                                    .build();

    /**
     * Sets BuildConfig.DEBUG of your application.
     *
     * @param debug BuildConfig.DEBUG of your application.
     */
    public static void setDebug(boolean debug) {
        LogFactory.debug = debug;
    }

    /**
     * Sets a value used as an android.util.Log's tag.
     *
     * @param tag A value used as an android.util.Log's tag.
     */
    public static void setTag(String tag) {
        if (tag == null || tag.length() == 0) {
            throw new IllegalArgumentException("tag is null/empty.");
        }
        LogFactory.tag = tag;
    }

    /**
     * Sets the configuration for debug.
     *
     * @param config The configuration for the debug build.
     */
    public static void setDebugConfig(LogConfig config) {
        debugConfig = config;
    }

    /**
     * Sets the coniguration for the release build.
     *
     * @param config The configuration for the release build.
     */
    public static void setReleaseConfig(LogConfig config) {
        releaseConfig = config;
    }

    /**
     * Returns an android.util.Log wrapper to log for the specified class.
     *
     * @param clazz A class that writes logs.
     * @return a android.util.Log wrapper.
     */
    public static Log getLog(Class<?> clazz) {
        LogConfig config = debug ? debugConfig : releaseConfig;
        String coreClassName = config.getLogCoreClassName();
        try {
            Class<?> coreClass = Class.forName(coreClassName);
            LogCore core = (LogCore) coreClass.newInstance();
            return new Log(core, tag, config, clazz);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LogFactoryException(e);
        }
    }

    public static class LogFactoryException extends RuntimeException {

        private LogFactoryException(Throwable cause) {
            super(cause);
        }
    }
}
