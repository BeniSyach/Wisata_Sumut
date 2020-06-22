package com.example.wisata_sumut1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tentang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
