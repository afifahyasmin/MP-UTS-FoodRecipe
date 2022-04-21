package com.afifah.foodrecipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(Button)findViewById(R.id.buttonLogin);

        login.setOnClickListener(v -> {
            Intent intent1 = new Intent(getApplicationContext(),MainMenu.class);
            startActivity(intent1);
            Toast.makeText(getApplicationContext(), "Hai! Selamat Datang", Toast.LENGTH_LONG)
                    .show();
        });
    }
}