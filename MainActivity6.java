package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity6 extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        button = (Button) findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity6.this,MainActivity7.class );
                startActivity(intent);
            }
        });


    }
}