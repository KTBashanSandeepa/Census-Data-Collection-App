package com.example.censusdatacollectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import yuku.ambilwarna.AmbilWarnaDialog;

public class ColorPicker extends AppCompatActivity {

    ConstraintLayout mLayout;
    int mDefultColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_picker);
        openColorPicker();

        mLayout = (ConstraintLayout) findViewById(R.id.layout);
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
        mDefultColor = sharedPreferences.getInt("color",0);
        if (mDefultColor==0)
            mDefultColor = ContextCompat.getColor(ColorPicker.this ,R.color.white);

        mLayout.setBackgroundColor(mDefultColor);
    }
    public void openColorPicker() {
        AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(this, mDefultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {
                Intent intent = new Intent(ColorPicker.this,NextActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                mDefultColor = color;
                mLayout.setBackgroundColor(mDefultColor);
                SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("color",mDefultColor);
                editor.apply();
                Intent intent = new Intent(ColorPicker.this,NextActivity.class);
                startActivity(intent);
                finish();
            }
        });
        colorPicker.show();
    }
}