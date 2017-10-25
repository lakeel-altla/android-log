package com.lakeel.altla.android.log.example;

import com.lakeel.altla.android.log.LogFactory;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LogFactory.setTag("AndroidLog");
        LogFactory.setDebug(BuildConfig.DEBUG);
    }
}
