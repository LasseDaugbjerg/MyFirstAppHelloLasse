package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "App Up And Running");
    }
    
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: This app is now paused!");
    }
    
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: This app is now resumed!");
    }
}