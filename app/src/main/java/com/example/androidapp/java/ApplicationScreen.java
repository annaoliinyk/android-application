package com.example.androidapp.java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapp.R;

public class ApplicationScreen extends AppCompatActivity {

    private EditText textViewTheWholeMessage;
    private Button ButtonApply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_screen);

        ButtonApply = findViewById(R.id.buttonApply);

        ButtonApply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String message = textViewTheWholeMessage.getText().toString();
                if(message.isEmpty()){
                    Toast.makeText(ApplicationScreen.this, "Message can't be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(ApplicationScreen.this, "Applied successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ApplicationScreen.this, HomePageActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
