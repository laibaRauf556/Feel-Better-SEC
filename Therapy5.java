package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Therapy5 extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapy5);
        button = (Button) findViewById(R.id.button37);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Therapy5.this, Therapy.class);
                startActivity(intent);
            }
        });
    }
}