package com.lakeel.altla.android.log.example;

import com.lakeel.altla.android.log.Log;
import com.lakeel.altla.android.log.LogFactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final Log LOG = LogFactory.getLog(MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LOG.v("Message");
        LOG.v("with arguments: %s, %d", "String", 1);
        LOG.d("Message");
        LOG.d("with arguments: %s, %d", "String", 1);
        LOG.i("Message");
        LOG.i("with arguments: %s, %d", "String", 1);
        LOG.w("Message");
        LOG.w("with arguments: %s, %d", "String", 1);
        LOG.w("with throwable", new Exception("Example exception."));
        LOG.e("Message");
        LOG.e("with arguments: %s, %d", "String", 1);
        LOG.e("with throwable", new Exception("Example exception."));
    }
}
