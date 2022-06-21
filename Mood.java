package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mood extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood);
        button = (Button) findViewById(R.id.button20);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mood.this,Mood1.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mood.this,Mood5.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button23);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mood.this,Mood7.class );
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button39);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mood.this,MainActivity5.class );
                startActivity(intent);
            }
        });
    }
}