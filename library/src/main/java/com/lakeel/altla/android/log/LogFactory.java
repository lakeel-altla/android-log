package com.lakeel.altla.android.log;

/**
 * The factory of android.util.Log wrappers.
 */
public final class LogFactory {

    private static final String TAG_DEFAULT = "DEFAULT";

    private static boolean sIsDebug;

    private static String sTag = TAG_DEFAULT;

    private static LogConfig sDebugConfig = new LogConfig.Builder().build();

    private static LogConfig sReleaseConfig = new LogConfig.Builder().setVerboseEnabled(false)
                                                                     .setDebugEnabled(false)
                                                                     .build();

    /**
     * Sets BuildConfig.DEBUG of your application.
     *
     * @param isDebug BuildConfig.DEBUG of your application.
     */
    public static void setDebug(boolean isDebug) {
        sIsDebug = isDebug;
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
        sTag = tag;
    }

    /**
     * Sets the configuration for debug.
     *
     * @param config The configuration for the debug build.
     */
    public static void setDebugConfig(LogConfig config) {
        sDebugConfig = config;
    }

    /**
     * Sets the coniguration for the release build.
     *
     * @param config The configuration for the release build.
     */
    public static void setReleaseConfig(LogConfig config) {
        sReleaseConfig = config;
    }

    /**
     * Returns an android.util.Log wrapper to log for the specified class.
     *
     * @param clazz A class that writes logs.
     * @return a android.util.Log wrapper.
     */
    public static Log getLog(Class<?> clazz) {
        LogConfig config = sIsDebug ? sDebugConfig : sReleaseConfig;
        return new Log(sTag, config, clazz);
    }
}
