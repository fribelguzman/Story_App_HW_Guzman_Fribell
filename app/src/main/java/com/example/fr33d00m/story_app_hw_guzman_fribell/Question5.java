package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Question5 extends AppCompatActivity {
    private EditText answerfifth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        findViewById(R.id.five);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.five).setBackgroundColor(randomAndroidColor);

    }

    public void next5(View view) {
        Intent tosixth = new Intent(this,Question6.class);
        String answer1= getIntent().getStringExtra("one");
        String answer2 = getIntent().getStringExtra("two");
        String answer3 = getIntent().getStringExtra("three");
        String answer4 = getIntent().getStringExtra("four");

        answerfifth = findViewById(R.id.answer5);
        String answer5 = answerfifth.getText().toString();

        tosixth.putExtra("one",answer1);
        tosixth.putExtra("two",answer2);
        tosixth.putExtra("three",answer3);
        tosixth.putExtra("four",answer4);
        tosixth.putExtra("five",answer5);
        startActivity(tosixth);



    }
}
