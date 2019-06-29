package com.rajarpit.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int answer;
    public void guess(View view) {
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        int guessno = Integer.parseInt(myTextField.getText().toString());
        if (guessno > answer)
        {
            Toast.makeText(MainActivity.this,"Lower !",Toast.LENGTH_SHORT).show();
            }
        else if(guessno < answer)
        {
            Toast.makeText(MainActivity.this,"Higher !",Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(MainActivity.this,"You're Right ! Try Again:)",Toast.LENGTH_LONG).show() ;
            Random rn = new Random();
            answer = rn.nextInt(20) + 1;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rn = new Random();
        answer = rn.nextInt(20) + 1;

    }
}
