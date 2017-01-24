package com.example.nitin.serviceexample1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by NITIN on 24-Jan-17.
 */
public class Serviceclass extends Service {

    @Override
    public void onDestroy() {
        Log.i("ser","ondestroy");
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("ser","onStartCommand");
        return START_STICKY;
    }

    @Override
    public void onCreate() {
        Log.i("ser","oncreate");
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
