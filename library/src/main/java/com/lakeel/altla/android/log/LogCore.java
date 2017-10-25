package com.lakeel.altla.android.log;

public interface LogCore {

    void v(String tag, String message);

    void d(String tag, String message);

    void i(String tag, String message);

    void w(String tag, String message);

    void w(String tag, String message, Throwable throwable);

    void e(String tag, String message);

    void e(String tag, String message, Throwable throwable);
}
