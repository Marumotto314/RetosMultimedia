package com.example.appintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AppIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appintent);
    }

    public void onPulsame(View v){
        Intent i = new Intent (this, SegundaActividad.class);
        startActivity(i);
    }
}