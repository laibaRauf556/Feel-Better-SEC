package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity9 extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

    button = (Button) findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity9.this,MainActivity10.class );
            startActivity(intent);
        }
    });
        button = (Button) findViewById(R.id.button12);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this,NewA.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity9.this,Newc.class );
                startActivity(intent);
            }
        });
    }
}