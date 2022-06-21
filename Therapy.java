package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Therapy extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapy);

        button = (Button) findViewById(R.id.button28);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy.this, Therapy1.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button29);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy.this, Therapy3.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button30);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy.this, Therapy4.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button31);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy.this, Therapy6.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button32);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}