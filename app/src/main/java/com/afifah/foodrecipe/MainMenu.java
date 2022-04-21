package com.afifah.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button btnBetawi, btnSunda, btnJawa, btnMinang, btnAbout, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btnBetawi = (Button) findViewById(R.id.btnBetawi);
        btnSunda = (Button) findViewById(R.id.btnSunda);
        btnJawa = (Button) findViewById(R.id.btnJawa);
        btnMinang = (Button) findViewById(R.id.btnMinang);
        btnAbout = (Button) findViewById(R.id.btnAbout);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnBetawi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, KhasBetawi.class);
                finish();
                startActivity(intent);
            }
        });

        btnSunda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, KhasSunda.class);
                finish();
                startActivity(intent);
            }
        });

        btnJawa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, KhasJawa.class);
                finish();
                startActivity(intent);
            }
        });

        btnMinang.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, KhasMinang.class);
                finish();
                startActivity(intent);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, About.class);
                finish();
                startActivity(intent);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi
            }
        });
    }
}