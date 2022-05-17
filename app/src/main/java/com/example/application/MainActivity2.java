package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {

    private Button btn, signUpBtn;
    private EditText usernameInput, emailInput, passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn = findViewById(R.id.loginBtn);
        signUpBtn = findViewById(R.id.signUpBtn);
        usernameInput = findViewById(R.id.username);
        emailInput = findViewById(R.id.email);
        passwordInput = findViewById(R.id.password);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = usernameInput.getText().toString().trim();
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();


                if (TextUtils.isEmpty(username)){
                    Toast.makeText(getApplicationContext(), "Username is required!", Toast.LENGTH_SHORT).show();
                    return;

                }else if (TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(), "Email is required!", Toast.LENGTH_SHORT).show();
                    return;

                }else if (TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(), "Password is required!", Toast.LENGTH_SHORT).show();
                    return;
                }else {
                    startActivity(new Intent(getApplicationContext(), Dashboard.class));
                    Toast.makeText(getApplicationContext(), "Register Successfull!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}