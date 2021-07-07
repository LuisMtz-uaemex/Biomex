package com.example.biomex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText nom;
    private EditText pass;
    private Button logi;
    private String nomb="admin";
    private String passw="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nom= findViewById(R.id.EditText);
        pass= findViewById(R.id.EditText2);
        logi= findViewById(R.id.button);
        logi.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String nombre= nom.getText().toString();
                String password= pass.getText().toString();
                if (nombre.equals(nomb) && password.equals(passw))
                {
                    Toast.makeText(MainActivity.this, "correcto", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(MainActivity.this, "incorrecto", Toast.LENGTH_LONG).show();

                }
            }
        });

    }
}