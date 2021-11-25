package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.smilemaker.modal.Jokes;

public class Homepage extends AppCompatActivity {
    String joke;
    Button btnNextJoke;
    TextView txtJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);



        btnNextJoke = findViewById(R.id.btnNextJoke);
        txtJoke = findViewById(R.id.txtJoke);
        txtJoke.setText(Jokes.getRandomJoke());
        btnNextJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Homepage.this, WallActivity.class);
                //    i.putExtra("joke", id);
                startActivity(i);

            }
        });

    }
}
