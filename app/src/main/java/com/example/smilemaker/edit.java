package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.smilemaker.controller.PostHandler;

public class edit extends AppCompatActivity {
    Button btnBack, btnEditJoke;
    TextView txtEditJoke;
    String jokeId, joke;

    PostHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);


        db = new PostHandler(getApplicationContext());

        btnBack = findViewById(R.id.btnBack);
        btnEditJoke = findViewById(R.id.btnEditJoke);
        txtEditJoke = findViewById(R.id.txtEditJoke);

        jokeId = getIntent().getSerializableExtra("jokeId").toString();
        joke = getIntent().getSerializableExtra("joke").toString();


        txtEditJoke.setText(joke);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WallActivity.class);
                getApplicationContext().startActivity(i);
            }
        });


        btnEditJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.EditPost(jokeId, txtEditJoke.getText().toString().trim(), getApplicationContext());
                Intent i = new Intent(getApplicationContext(), WallActivity.class);
                getApplicationContext().startActivity(i);

            }
        });


    }
}