package com.auxor.appwithmodifiedframework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.app.ActivityManager;
import android.app.ActivityManager2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityManager am = (ActivityManager) this.getSystemService(Context.ACTIVITY_SERVICE);
        am.addMode();

        ActivityManager2 am2 = new ActivityManager2();
        am2.testCall();
    }
}
