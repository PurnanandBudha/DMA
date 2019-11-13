package com.example.todo_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

public class ToDoDetailActivity extends AppCompatActivity {
    private TextView detail_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_detail);
//        Intent intent=getIntent();
//        int todo_index = intent.getIntExtra(MainActivity.ToDoIndex, 0);
//        detail_view = findViewById(R.id.detail_view);
    }
}
