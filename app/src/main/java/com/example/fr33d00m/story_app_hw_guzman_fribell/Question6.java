package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question6 extends AppCompatActivity {
    private EditText answersix;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        findViewById(R.id.six);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.six).setBackgroundColor(randomAndroidColor);

    }

    public void next6(View view) {
        Intent toseventh = new Intent (this, Question7.class);
        String answer1 = getIntent().getStringExtra("one");
        String answer2 = getIntent().getStringExtra("two");
        String answer3 = getIntent().getStringExtra("three");
        String answer4 = getIntent().getStringExtra("four");
        String answer5 = getIntent().getStringExtra("five");

        answersix = findViewById(R.id.answer6);
        String answer6 = answersix.getText().toString();

        toseventh.putExtra("one", answer1);
        toseventh.putExtra("two",answer2);
        toseventh.putExtra("three",answer3);
        toseventh.putExtra("four",answer4);
        toseventh.putExtra("five",answer5);
        toseventh.putExtra("six",answer6);
        startActivity(toseventh);



    }
}
