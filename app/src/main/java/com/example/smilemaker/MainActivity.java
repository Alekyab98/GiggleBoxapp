package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userName;
    EditText password;


    usermodal um = usermodal.getSingleton();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.editTextTextPersonName);
        password = findViewById(R.id.editTextTextPersonName2);

    }


    public void signup (View view){


        Intent intent = new Intent(getBaseContext(),loginActivity.class);
        startActivity(intent);
    }

    public void signinid(View view){

        String user = userName.getText().toString();
        String pass = password.getText().toString();

        for(int i = 0; i < um.allUsers.size(); i++) {
            if(um.allUsers.get(i).login.equals(user) && um.allUsers.get(i).password.equals(pass) ) {
                Intent intent1 = new Intent(getBaseContext(),homepage.class);
                startActivity(intent1);
            }
        }


    }

}