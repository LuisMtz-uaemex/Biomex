package com.example.biomex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity
{
    private Button prb;
    private Button prb2;
    private Button prb3;
    private Button prb4;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        prb = findViewById(R.id.button4);
        prb2= findViewById(R.id.button3);
        prb3= findViewById(R.id.button6);
        prb4= findViewById(R.id.button5);
        prb.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity3.this,"hola historias",Toast.LENGTH_LONG).show();
            }
        });
        prb2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(MainActivity3.this,"hola productos",Toast.LENGTH_LONG).show();

            }
        });
        prb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        prb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Saliendo", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}