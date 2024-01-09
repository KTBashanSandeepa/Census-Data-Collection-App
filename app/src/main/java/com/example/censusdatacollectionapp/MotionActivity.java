package com.example.censusdatacollectionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class MotionActivity extends AppCompatActivity {
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion);


        //check registered or not

        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
        boolean registered = sharedPreferences.getBoolean("REGISTERED", false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent;
                if (registered){
                    intent= new Intent(MotionActivity.this,Login.class);
                }
                else{
                    intent = new Intent(MotionActivity.this,Register.class);
                }
                startActivity(intent);
                finish();
            }
        },3000);
    }
}