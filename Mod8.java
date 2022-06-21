package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Mod8 extends AppCompatActivity {
    public ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod8);
        button = (ImageButton) findViewById(R.id.imageButton15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Mod8.this,Mood.class );
                startActivity(intent);
            }
        });
    }
}