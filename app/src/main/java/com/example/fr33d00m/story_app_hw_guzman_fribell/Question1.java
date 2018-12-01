package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question1 extends AppCompatActivity {
    private EditText answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        findViewById(R.id.one);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.one).setBackgroundColor(randomAndroidColor);

    }
    //Returns name
    public void next1(View view) {
        Intent tosecond = new Intent(this,Question2.class);
        answer = findViewById(R.id.answer1);
        String answer1 = answer.getText().toString();
        tosecond.putExtra("one",answer1);
        startActivity(tosecond);
    }
}
