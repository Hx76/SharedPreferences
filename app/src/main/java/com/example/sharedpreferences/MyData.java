package com.example.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;

public class MyData {
    private Context context;
    public int Number;

    public MyData(Context context){
        this.context = context;
    }

    public void save(){
        String name = context.getResources().getString(R.string.MY_DATA);
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_DATA",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String key = context.getResources().getString(R.string.MY_KEY);
        editor.putInt(key,Number);
        editor.apply();
    }
    public int load(){
        String name = context.getResources().getString(R.string.MY_DATA);
        SharedPreferences sharedPreferences = context.getSharedPreferences("MY_DATA",Context.MODE_PRIVATE);
        String key = context.getResources().getString(R.string.MY_KEY);
        int x = sharedPreferences.getInt(key,context.getResources().getInteger(R.integer.defValue));
        Number = x;
        return x;
    }
}
