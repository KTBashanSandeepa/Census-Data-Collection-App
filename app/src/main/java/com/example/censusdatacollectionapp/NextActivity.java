package com.example.censusdatacollectionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.example.censusdatacollectionapp.databinding.ActivityMainBinding;
import com.example.censusdatacollectionapp.databinding.ActivityNextBinding;

public class NextActivity extends AppCompatActivity {

   ActivityNextBinding binding;
    ConstraintLayout mLayout;
    int mDefultColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mLayout = (ConstraintLayout) findViewById(R.id.layout);
        SharedPreferences sharedPreferences = getSharedPreferences("SharedPref",MODE_PRIVATE);
        mDefultColor = sharedPreferences.getInt("color",0);
        if (mDefultColor==0)
            mDefultColor = ContextCompat.getColor(NextActivity.this ,R.color.white);

        mLayout.setBackgroundColor(mDefultColor);

        repalceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item ->{

            switch (item.getItemId()){
                case R.id.home:
                    repalceFragment(new HomeFragment());
                    break;
                case R.id.add:
                    repalceFragment(new DataFragment());
                    break;
                case  R.id.preferences:
                    repalceFragment(new PreferencesFragment());
                    break;


            }
            return true;
        } );



    }
    private void repalceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }

}