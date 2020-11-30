package com.example.androidapp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.androidapp.R;

public class MainActivity extends AppCompatActivity {

    private EditText eEmail;
    private EditText ePassword;
    private Button eLogin;

    private String Email = "admin@gmail.com";
    private String Password = "12345678";

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eEmail = findViewById(R.id.enterAddressee);
        ePassword = findViewById(R.id.password);
        eLogin = findViewById(R.id.buttonLogin);

        eLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String inputEmail = eEmail.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputEmail.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter email and password", Toast.LENGTH_SHORT).show();
                }
                else {
                    isValid = validate(inputEmail, inputPassword);
                    if(!isValid){
                        Toast.makeText(MainActivity.this, "Incorrect email or password", Toast.LENGTH_SHORT).show();
                    }

                    else {
                        Toast.makeText(MainActivity.this, "Login was successful", Toast.LENGTH_SHORT).show();

                        // Next activity
                        Intent intent = new Intent(MainActivity.this, HomePageActivity.class);
                        startActivity(intent);
                    }

                }
            }
        });
    }

    private boolean validate(String email, String password){
        return email.equals(Email) && password.equals(Password);
    }
}