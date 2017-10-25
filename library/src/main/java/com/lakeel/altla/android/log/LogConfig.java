package com.lakeel.altla.android.log;

public final class LogConfig {

    private boolean fullyQualifiedClassNameUsed;

    private boolean verboseEnabled;

    private boolean debugEnabled;

    private boolean infoEnabled;

    private boolean warnEnabled;

    private boolean errorEnabled;

    private LogFormatter formatter;

    public boolean isFullyQualifiedClassNameUsed() {
        return fullyQualifiedClassNameUsed;
    }

    public boolean isVerboseEnabled() {
        return verboseEnabled;
    }

    public boolean isDebugEnabled() {
        return debugEnabled;
    }

    public boolean isInfoEnabled() {
        return infoEnabled;
    }

    public boolean isWarnEnabled() {
        return warnEnabled;
    }

    public boolean isErrorEnabled() {
        return errorEnabled;
    }

    public LogFormatter getFormatter() {
        return formatter;
    }

    public static class Builder {

        private boolean fullyQualifiedClassNameUsed;

        private boolean verboseEnabled = true;

        private boolean debugEnabled = true;

        private boolean infoEnabled = true;

        private boolean warnEnabled = true;

        private boolean errorEnabled = true;

        private LogFormatter formatter = DefaultLogFormatter.INSTANCE;

        public LogConfig build() {
            LogConfig config = new LogConfig();
            config.fullyQualifiedClassNameUsed = fullyQualifiedClassNameUsed;
            config.verboseEnabled = verboseEnabled;
            config.debugEnabled = debugEnabled;
            config.infoEnabled = infoEnabled;
            config.warnEnabled = warnEnabled;
            config.errorEnabled = errorEnabled;
            config.formatter = formatter;
            return config;
        }

        public Builder setFullyQualifiedClassNameUsed(boolean fullyQualifiedClassNameUsed) {
            this.fullyQualifiedClassNameUsed = fullyQualifiedClassNameUsed;
            return this;
        }

        public Builder setVerboseEnabled(boolean verboseEnabled) {
            this.verboseEnabled = verboseEnabled;
            return this;
        }

        public Builder setDebugEnabled(boolean debugEnabled) {
            this.debugEnabled = debugEnabled;
            return this;
        }

        public Builder setInfoEnabled(boolean infoEnabled) {
            this.infoEnabled = infoEnabled;
            return this;
        }

        public Builder setWarnEnabled(boolean warnEnabled) {
            this.warnEnabled = warnEnabled;
            return this;
        }

        public Builder setErrorEnabled(boolean errorEnabled) {
            this.errorEnabled = errorEnabled;
            return this;
        }

        public Builder setFormatter(LogFormatter formatter) {
            if (formatter == null) throw new IllegalArgumentException("'formatter' must be not null.");

            this.formatter = formatter;
            return this;
        }
    }
}
