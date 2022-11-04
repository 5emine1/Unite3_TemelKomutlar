package com.example.temelkomutlarunite_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ravza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ravza = findViewById(R.id.ravza);
        ravza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa = new Intent(MainActivity.this,Uyg1Activity.class);
                startActivity(sa);
            }
        });
    }
}