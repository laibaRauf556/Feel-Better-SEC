package com.example.project123;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity17 extends AppCompatActivity {
    public ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
        button = (ImageButton) findViewById(R.id.imageButton8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity17.this,extra.class );
                startActivity(intent);
            }
        });
    }
}