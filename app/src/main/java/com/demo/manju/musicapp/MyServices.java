package com.demo.manju.musicapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;


/**
 * Created by sai on 25-08-2018.
 */

public class MyServices extends Service {

    private MediaPlayer mediaPlayer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        mediaPlayer = MediaPlayer.create(this,R.raw.song);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        mediaPlayer.stop();
    }
}
