package com.example.databasesample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText title_inp, author_inp, pages_inp;
    Button submit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_inp = findViewById(R.id.title_inp);
        author_inp = findViewById(R.id.author_inp);
        pages_inp = findViewById(R.id.pages_inp);

        submit_btn = findViewById(R.id.submit_btn);
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper dbHelper = new DatabaseHelper(AddActivity.this);
                dbHelper.addBook(title_inp.getText().toString().trim(),
                        author_inp.getText().toString().trim(),
                        Integer.valueOf(pages_inp.getText().toString().trim()));
            }
        });
    }
}