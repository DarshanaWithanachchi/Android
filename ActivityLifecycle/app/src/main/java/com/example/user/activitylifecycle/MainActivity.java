package com.example.user.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
public static final String My_Tag = "This Custome Message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(My_Tag,"onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MY_TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MY_TAG, "onDestroy");
    }


}
