package com.example.moham.byomi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Byomi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_byomi);

    }
    public void Play(View view){


        Intent intent = new Intent(this, Instructions.class);
        startActivity(intent);
    }
}
