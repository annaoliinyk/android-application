package com.example.androidapp.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidapp.R;

public class HomePageActivity extends AppCompatActivity {

    private Button browseButton;
    private Button inboxButton;
    private Button updateButton;
    private Button logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        browseButton = findViewById(R.id.browseButton);
        inboxButton = findViewById(R.id.inboxButton);
        updateButton = findViewById(R.id.updateButton);
        logoutButton = findViewById(R.id.logoutButton);

        browseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HomePageActivity.this, BrowsePositions.class);
                startActivity(intent);
            }
        });

        inboxButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HomePageActivity.this, InboxActivity.class);
                startActivity(intent);
            }
        });

        updateButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(HomePageActivity.this, UpdateAccount.class);
                startActivity(intent);
            }
        });

        logoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                System.exit(0);
            }
        });
    }
}