package com.example.arjun.serviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

    }
    public void startService(View View){
        Intent in=new Intent(ServiceActivity.this,ServiceClass.class);
        startService(in);
    }
}
