package com.example.stayfit;
//build latest gradle version
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class one extends AppCompatActivity {
    //private static final  String Tag = "MainActivity";
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent=new Intent(one.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
        /*CountDownTimer countDownTimer =  new CountDownTimer(5000+100,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i(Tag,"onTick: "+millisUntilFinished);
                Log.i(Tag,"onTick: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                Log.i(Tag,"onFinish: Timer is finished");

            }
        };
        countDownTimer.start();*/
    }
}