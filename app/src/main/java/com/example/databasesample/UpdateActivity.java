package com.example.databasesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {
    EditText title_inp, author_inp, pages_inp;
    Button update_btn;

    String id, title, author, pages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        title_inp = findViewById(R.id.title_inp2);
        author_inp = findViewById(R.id.author_inp2);
        pages_inp = findViewById(R.id.pages_inp2);
        update_btn = findViewById(R.id.update_btn);
        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        getAndSetIntentData();

    }
    void getAndSetIntentData(){
        if(getIntent().hasExtra("id")
                && getIntent().hasExtra("title")
                && getIntent().hasExtra("author")
                && getIntent().hasExtra("pages")){
            // get data from Intent
            id = getIntent().getStringExtra("id");
            title = getIntent().getStringExtra("title");
            author = getIntent().getStringExtra("author");
            pages = getIntent().getStringExtra("pages");

            // set data
            title_inp.setText(title);
            author_inp.setText(author);
            pages_inp.setText(pages);

        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }

}