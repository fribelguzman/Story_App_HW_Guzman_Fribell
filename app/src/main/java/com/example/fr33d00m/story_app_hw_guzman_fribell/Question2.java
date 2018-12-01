package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Question2 extends AppCompatActivity {
    private EditText answertwo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        findViewById(R.id.two);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.two).setBackgroundColor(randomAndroidColor);



    }

    public void next2(View view) {
        Intent tothird = new Intent(this, Question3.class);
        String answer1 = getIntent().getStringExtra("one");
        answertwo = findViewById(R.id.answer2);
        String answer2 = answertwo.getText().toString();
        tothird.putExtra("one",answer1);
        tothird.putExtra("two",answer2);
        startActivity(tothird);

    }
}
