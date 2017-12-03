package com.example.arjun.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by ARJUN on 12/2/2017.
 */

public class ServiceClass extends Service{
    int newStartId;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;

    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"service created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, final int startId) {
        newStartId=startId;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                    stopSelfResult(startId);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();

        return START_STICKY;
    }
}
