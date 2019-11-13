package com.example.todo_first;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class ToDoDetailActivity extends AppCompatActivity {
    private int currentIndex;
    private TextView textView;
    private String[] details;
    private static final String TODO_KEY = "com.example.todoKey";
    public static final String IS_TODO_COMPLETE = "com.example.isTodoComplete";

    public static Intent newIntent(Context packageContext, int todoIndex){
        Intent intent = new Intent(packageContext, ToDoDetailActivity.class);
        intent.putExtra(TODO_KEY, todoIndex);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_detail);

        if (savedInstanceState != null){
            currentIndex = savedInstanceState.getInt(TODO_KEY, 0);
        }
        int mTodoIndex = getIntent().getIntExtra(TODO_KEY, 0);
        updateTextViewTodoDetail(mTodoIndex);

        int currentIndex = getIntent().getIntExtra(MainActivity.IS_TODO_COMPLETE, 0);

        textView = (TextView) findViewById(R.id.detail_view);
        textView.setText(details[currentIndex]);

        CheckBox checkBoxIsComplete = (CheckBox) findViewById(R.id.checkBox);
        checkBoxIsComplete.setOnClickListener(mTodoListener);


    }

    private void updateTextViewTodoDetail(int todoKey){
        final TextView textViewTodoDetail;
        textViewTodoDetail = (TextView) findViewById(R.id.detail_view);

        Resources res = getResources();
        details = res.getStringArray(R.array.details);

        textViewTodoDetail.setText(details[todoKey]);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TODO_KEY, currentIndex);
    }

    private View.OnClickListener mTodoListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.checkBox:
                    CheckBox checkBoxIsComplete = (CheckBox) findViewById(R.id.checkBox);
                    setIsComplete(checkBoxIsComplete.isChecked());
                    finish();
                    break;
                default:
                    break;
            }
        }
    };


    public void setIsComplete(boolean isChecked) {
        if(isChecked){
            Toast.makeText(ToDoDetailActivity.this, "Hurray, it's done!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(ToDoDetailActivity.this, "There is always tomorrow!", Toast.LENGTH_LONG).show();
        }
        Intent intent = new Intent();
        intent.putExtra(IS_TODO_COMPLETE, isChecked);
        setResult(RESULT_OK,intent);
    }
}
