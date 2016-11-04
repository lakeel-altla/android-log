package com.lakeel.altla.android.log;

/**
 * Defines the formetter that formats messages logged.
 */
public interface LogFormatter {

    /**
     * Creates a log message.
     *
     * @param className The class name that the logger targets at.
     * @param message   The original message that is specified with a log method of {@link Log}.
     * @return A log message.
     */
    String format(String className, String message);

    /**
     * Creates a log message.
     *
     * @param className The class name that the logger targets at.
     * @param format    The format that is specified with a log method of {@link Log}.
     * @param args      The additional arguments that are specified with a log method of {@link Log}.
     * @return A log message.
     */
    String format(String className, String format, Object... args);
}
