package com.lakeel.altla.android.log;

public final class LogConfig {

    private boolean mIsFullyQualifiedClassNameUsed;

    private boolean mIsVerboseEnabled;

    private boolean mIsDebugEnabled;

    private boolean mIsInfoEnabled;

    private boolean mIsWarnEnabled;

    private boolean mIsErrorEnabled;

    public boolean isFullyQualifiedClassNameUsed() {
        return mIsFullyQualifiedClassNameUsed;
    }

    public boolean isVerboseEnabled() {
        return mIsVerboseEnabled;
    }

    public boolean isDebugEnabled() {
        return mIsDebugEnabled;
    }

    public boolean isInfoEnabled() {
        return mIsInfoEnabled;
    }

    public boolean isWarnEnabled() {
        return mIsWarnEnabled;
    }

    public boolean isErrorEnabled() {
        return mIsErrorEnabled;
    }

    public static class Builder {

        private boolean mIsFullyQualifiedClassNameUsed;

        private boolean mIsVerboseEnabled = true;

        private boolean mIsDebugEnabled = true;

        private boolean mIsInfoEnabled = true;

        private boolean mIsWarnEnabled = true;

        private boolean mIsErrorEnabled = true;

        public LogConfig build() {
            LogConfig config = new LogConfig();
            config.mIsFullyQualifiedClassNameUsed = mIsFullyQualifiedClassNameUsed;
            config.mIsVerboseEnabled = mIsVerboseEnabled;
            config.mIsDebugEnabled = mIsDebugEnabled;
            config.mIsInfoEnabled = mIsInfoEnabled;
            config.mIsWarnEnabled = mIsWarnEnabled;
            config.mIsErrorEnabled = mIsErrorEnabled;
            return config;
        }

        public Builder setFullyQualifiedClassNameUsed(boolean fullyQualifiedClassNameUsed) {
            this.mIsFullyQualifiedClassNameUsed = fullyQualifiedClassNameUsed;
            return this;
        }

        public Builder setVerboseEnabled(boolean verboseEnabled) {
            mIsVerboseEnabled = verboseEnabled;
            return this;
        }

        public Builder setDebugEnabled(boolean debugEnabled) {
            mIsDebugEnabled = debugEnabled;
            return this;
        }

        public Builder setInfoEnabled(boolean infoEnabled) {
            mIsInfoEnabled = infoEnabled;
            return this;
        }

        public Builder setWarnEnabled(boolean warnEnabled) {
            mIsWarnEnabled = warnEnabled;
            return this;
        }

        public Builder setErrorEnabled(boolean errorEnabled) {
            mIsErrorEnabled = errorEnabled;
            return this;
        }
    }
}
