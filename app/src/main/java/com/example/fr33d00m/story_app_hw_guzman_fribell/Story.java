package com.example.fr33d00m.story_app_hw_guzman_fribell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Story extends AppCompatActivity {
private TextView Story;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);


        findViewById(R.id.story);

        int[] androidColors = getResources().getIntArray(R.array.androidcolors);
        int randomAndroidColor = androidColors[new Random().nextInt(androidColors.length)];
        findViewById(R.id.story).setBackgroundColor(randomAndroidColor);


        String answer1 = getIntent().getStringExtra("one");
        String answer2 = getIntent().getStringExtra("two");
        String answer3 = getIntent().getStringExtra("three");
        String answer4 = getIntent().getStringExtra("four");
        String answer5 = getIntent().getStringExtra("five");
        String answer6 = getIntent().getStringExtra("six");
        String answer7 = getIntent().getStringExtra("seven");
        Story = findViewById(R.id.Story);

       String Narrative = "There once was a " + answer2 + " by the name of " + answer1 + " Who lived in the " + answer3 +
         " "+ answer1 + " loved to "+ answer5 + " all day and all night , but hated "
               + answer6 + " with all her might. "
               + answer1 + " superpower was " + answer4 +  " and used it to defeat all evil. Then lived happily ever after " + answer7 + ".";

       Story.setText(Narrative);
    }
}
