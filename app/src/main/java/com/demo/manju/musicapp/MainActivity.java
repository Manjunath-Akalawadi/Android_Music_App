package com.demo.manju.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button startM , stopM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startM = (Button) findViewById(R.id.startM);
        stopM = (Button) findViewById(R.id.stopM);

        startM.setOnClickListener(this);
        stopM.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v==startM){

            startService(new Intent(this,MyServices.class));
        }else {

            stopService(new Intent(this,MyServices.class));
        }

    }
}
