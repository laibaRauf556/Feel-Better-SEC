package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mood6 extends AppCompatActivity {
    public ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood6);
        button = (ImageButton) findViewById(R.id.imageButton13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mood6.this,Mood.class );
                startActivity(intent);
            }
        });
    }
}