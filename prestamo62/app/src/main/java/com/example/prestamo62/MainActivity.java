package com.example.prestamo62;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reloj();
    }
    public void reloj() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // acciones que se ejecutan tras los milisegundos
                finmain();
            }
        }, 5000); //8segundo
    }
    public void finmain() {
        Intent siguiente = new Intent(this,Login.class);
        startActivity(siguiente);
        finish();
    }
}