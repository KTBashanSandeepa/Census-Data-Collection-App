package com.example.censusdatacollectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Login extends AppCompatActivity {

    private EditText editText;
    private String password;
    private int errorCount=0;
    ConstraintLayout mLayout;
    int mDefultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onclick(View view) {
        editText = (EditText) findViewById(R.id.pwdLogin);
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
        password = sharedPreferences.getString("password","");

        mLayout = (ConstraintLayout) findViewById(R.id.layout);
        mDefultColor = sharedPreferences.getInt("color",0);
        if (mDefultColor==0)
            mDefultColor = ContextCompat.getColor(Login.this ,R.color.white);

        mLayout.setBackgroundColor(mDefultColor);

        if(password.equals(editText.getText().toString())){
            Intent intent = new Intent(Login.this,NextActivity.class);
            startActivity(intent);
            finish();
        }else {
            editText.setError("worng password");
            errorCount++;
            if(errorCount>=3){
                Context context = getApplicationContext();
                CharSequence text = "Wrong password, Closing App";
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Login.this.finish();
                System.exit(0);
            }
        }
    }
}