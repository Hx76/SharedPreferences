package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyData data = new MyData(getApplicationContext());//不能传递this内存泄漏
        data.Number = 1000;
        data.save();
        int y = data.load();
//        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putInt("Number",100);
//        editor.apply();
//        int x = sharedPreferences.getInt("Number",0);
        String TAG = "mylog";
        Log.d(TAG,"onCreate"+y);


    }
}
