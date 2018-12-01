package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question4 extends AppCompatActivity {
    private EditText answerfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        findViewById(R.id.four);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.four).setBackgroundColor(randomAndroidColor);



    }

    public void next4(View view) {
        Intent tofifth = new Intent(this , Question5.class);
        String answer1 = getIntent().getStringExtra("one");
        String answer2 = getIntent().getStringExtra("two");
        String answer3 = getIntent().getStringExtra("three");
        answerfour = findViewById(R.id.answer4);
        String answer4 = answerfour.getText().toString();
        tofifth.putExtra("one",answer1);
        tofifth.putExtra("two",answer2);
        tofifth.putExtra("three",answer3);
        tofifth.putExtra("four",answer4);
        startActivity(tofifth);
    }
}
