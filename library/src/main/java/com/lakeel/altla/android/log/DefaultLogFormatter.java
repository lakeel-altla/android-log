package com.lakeel.altla.android.log;

/**
 * Defines a formetter implementation used by default.
 * This class uses the format "[&lt;class-name&gt;] [&lt;thread-name&gt;] &lt;message&gt;".
 */
public final class DefaultLogFormatter implements LogFormatter {

    public static final DefaultLogFormatter INSTANCE = new DefaultLogFormatter();

    private static final String BASE_FORMAT = "[%s] [%s] %s";

    private DefaultLogFormatter() {
    }

    @Override
    public String format(String className, String message) {
        return String.format(BASE_FORMAT, Thread.currentThread().getName(), className, message);
    }

    @Override
    public String format(String className, String format, Object... args) {
        String message = String.format(format, args);
        return format(className, message);
    }
}
