package com.example.myapplication33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent A = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(A);
        Intent B = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(B);


    }
}