package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question3 extends AppCompatActivity {
    private EditText answerthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);

        findViewById(R.id.three);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.three).setBackgroundColor(randomAndroidColor);



    }

    public void next3(View view) {
        Intent tofourth = new Intent(this, Question4.class);
        String answer1 = getIntent().getStringExtra("one");
         String answer2 = getIntent().getStringExtra("two");
         answerthree = findViewById(R.id.answer3);
         String answer3 = answerthree.getText().toString();
         tofourth.putExtra("one", answer1);
         tofourth.putExtra("two", answer2);
         tofourth.putExtra("three", answer3);
         startActivity(tofourth);
    }
}
