package com.example.androidapp.java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.androidapp.R;

public class InboxActivity  extends AppCompatActivity {

    private Button bNewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);

        bNewMessage = findViewById(R.id.buttonNewMessage);
        bNewMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(InboxActivity.this, NewMessageActivity.class);
                startActivity(intent);
            }
        });
    }
}
