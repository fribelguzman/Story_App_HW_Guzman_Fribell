package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question7 extends AppCompatActivity {
    private EditText answerseven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        findViewById(R.id.seven);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.seven).setBackgroundColor(randomAndroidColor);


    }

    public void next7(View view) {
        Intent tostory = new Intent(this,Story.class);
        String answer1 = getIntent().getStringExtra("one");
        String answer2 = getIntent().getStringExtra("two");
        String answer3 = getIntent().getStringExtra("three");
        String answer4 = getIntent().getStringExtra("four");
        String answer5 = getIntent().getStringExtra("five");
        String answer6 = getIntent().getStringExtra("six");
        answerseven = findViewById(R.id.answer7);
        String answer7 = answerseven.getText().toString();
        tostory.putExtra("one",answer1);
        tostory.putExtra("two",answer2);
        tostory.putExtra("three",answer3);
        tostory.putExtra("four",answer4);
        tostory.putExtra("five",answer5);
        tostory.putExtra("six",answer6);
        tostory.putExtra("seven",answer7);
        startActivity(tostory);

    }
}
