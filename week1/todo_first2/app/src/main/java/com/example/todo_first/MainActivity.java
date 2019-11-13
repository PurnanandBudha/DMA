package com.example.todo_first;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int IS_SUCCESS = 0;
    private int currentIndex=0;
    private TextView mShowCount;
    private Button detailButton;
    String[] games;
    public static final String TAG = "TodoActivity";
    public static final String IS_TODO_COMPLETE="com.example.isTodoComplete";
    private static final String TODO_KEY = "com.example.todoKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            currentIndex = savedInstanceState.getInt(TODO_KEY,0);
        }

        final TextView textViewTodo;
        textViewTodo = (TextView) findViewById(R.id.textView);

        setTextViewComplete("");

        mShowCount = (TextView) findViewById(R.id.textView);
        mShowCount.setText(""+currentIndex);

        Resources res = getResources();
        games = res.getStringArray(R.array.games);
//        games = getResources().getStringArray(R.array.games);
        mShowCount.setText(games[currentIndex]);

        detailButton = (Button) findViewById(R.id.skip_button);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ToDoDetailActivity.newIntent(MainActivity.this, currentIndex);
                startActivityForResult(intent, IS_SUCCESS);
            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt(TODO_KEY, currentIndex);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == IS_SUCCESS){
            if (data != null){
                boolean isTodoComplete = data.getBooleanExtra(IS_TODO_COMPLETE, false);
                updateTodoComplete(isTodoComplete);
            }else {
                Toast.makeText(this, "Back button Pressed", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this, "requestCode in intent doesnot match the parent request...",
                    Toast.LENGTH_SHORT).show();
        }
    }

    private void updateTodoComplete(boolean is_todo_complete){
        final TextView textView;
        textView = (TextView) findViewById(R.id.textView);

        if (is_todo_complete){
            textView.setBackgroundColor(
                    ContextCompat.getColor(this, R.color.colorPrimary)
            );
            textView.setTextColor(
                    ContextCompat.getColor(this, R.color.colorAccent)
            );
            setTextViewComplete("\u2713");
        }
    }

    private void setTextViewComplete(String message){
        final TextView textViewComplete;
        textViewComplete = (TextView) findViewById(R.id.textViewComplete);
        textViewComplete.setText(message);
    }

    @Override
    protected void onStart() {
        Log.d( "MainActivity", "onStart()");
        super.onStart();

    }

    @Override
    protected void onPause() {
        Log.d( "MainActivity", "onPause()");

        super.onPause();
    }

    @Override
    protected void onPostResume() {
        Log.d( "MainActivity", "onPostResume()");
        super.onPostResume();
    }

    @Override
    protected void onStop() {
        Log.d( "MainActivity", "onStop()");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d( "MainActivity", "onDestroy()");
        super.onDestroy();
    }

    public void next_perform(View view) {
        currentIndex = ++currentIndex % games.length;
        mShowCount.setText(games[currentIndex]);
        Log.d("MainActivity", "Values of current index:" +currentIndex);
    }

    public void prev_perform(View view) {
        if (currentIndex > 0){
            currentIndex = currentIndex % games.length;
        }else{
            currentIndex = games.length;
        }
        currentIndex = --currentIndex % games.length;
        mShowCount.setText(games[currentIndex]);
    }

    public void skip(View view) {
    }
}
