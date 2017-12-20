package com.example.root.simpledrumpadapp;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
mp=MediaPlayer.create(this,R.raw.screw_u_x);
mp.setAudioStreamType(AudioManager.STREAM_MUSIC);

    }


    public void playsound(View view) {

        switch (view.getId()) {

            case R.id.button1:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.respect_x);
                mp.start();
                break;

            case R.id.button2:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.carlin_blow_it);
                mp.start();
                break;
            case R.id.button3:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.dice_problem);
                mp.start();
                break;

            case R.id.button4:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.carlin_who_gives_x);
                mp.start();
                break;

            case R.id.button5:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.bitch_ass_in_kitchen_z);
                mp.start();

                break;

            case R.id.button6:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.kiss_my_ass);
                mp.start();

                break;


            case R.id.button7:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.screw_u_x);
                mp.start();


                break;
            case R.id.button8:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.raging);
                mp.start();


                break;
            case R.id.button9:
                if (mp.isPlaying()) mp.release();
                mp = MediaPlayer.create(getApplicationContext(), R.raw.foxworthy1);
                mp.start();
                break;

        }

    }

    public void StopSound(View view) {
        if (mp.isPlaying()) mp.stop();
        mp.release();
    }
}
