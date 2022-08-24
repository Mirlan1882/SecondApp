package com.example.secondapp;


import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    EditText email,password;
    Button next;
    TextView vypolni,reg,zabyl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        next = findViewById(R.id.button);
        vypolni = findViewById(R.id.vypolni);
        reg = findViewById(R.id.reg);
        zabyl = findViewById(R.id.zabyl);
        
        
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.equals("")) {
                    next.setBackgroundColor(Color.GRAY);
                } else {
                    next.setBackgroundColor(Color.YELLOW);
                }
            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (email.equals("")) {
                    next.setBackgroundColor(Color.GRAY);
                } else {
                    next.setBackgroundColor(Color.YELLOW);
                }
            }
        });


        
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    vypolni.setVisibility(View.GONE);
                    email.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    next.setVisibility(View.GONE);
                    zabyl.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}