package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class extra extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        button = (Button) findViewById(R.id.button14);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity6.class );
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button15);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity11.class );
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.button17);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity13.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button18);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity17.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button19);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity15.class );
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.button40);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(extra.this,MainActivity5.class );
                startActivity(intent);
            }
        });
    }
}