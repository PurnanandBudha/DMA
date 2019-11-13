package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private boolean toogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showFragment(BlankFragment.class);
    }

    private void showFragment(Class blankFragmentClass) {
        Fragment frag = null;
        try{
            frag = (Fragment) blankFragmentClass.newInstance();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (InstantiationException e){
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragment_container, frag).commit();
    }

    public void changeFragment(View view) {
        if(toogle)
            showFragment(BlankFragment.class);
        else
            showFragment(BlankFragment2.class);
        toogle = !toogle;
    }
}
