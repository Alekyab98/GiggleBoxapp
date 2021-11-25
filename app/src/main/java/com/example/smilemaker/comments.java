package com.example.smilemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.smilemaker.controller.CommentHandler;

import java.util.ArrayList;

public class comments extends AppCompatActivity {
    EditText txtComment;
    Button btnComment, btnBack;
    CommentHandler db;
    ListView listComments;
    String postID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
        Bundle b = getIntent().getExtras();
        postID = b.getString("postID");
        txtComment = findViewById(R.id.txtComment);
        btnComment = findViewById(R.id.btnEditJoke);
        btnBack = findViewById(R.id.btnBack);
        listComments = findViewById(R.id.listComments);
        db = new CommentHandler(getApplicationContext());
        ArrayList<String> list = db.fetchAllComments(postID);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,
                list);
        listComments.setAdapter(arr);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), WallActivity.class);
                getApplicationContext().startActivity(i);
            }
        });


        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.addNewComment(postID, txtComment.getText().toString().trim(), getApplicationContext());
                Toast.makeText(getApplicationContext(), "Comment Added", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), comments.class);
                i.putExtra("postID", postID);
                getApplicationContext().startActivity(i);
            }
        });

    }
}