package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_Ask);

        final ImageView eightBall = findViewById(R.id.image_eightBall);

        final int[] eightBallArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        final Random rng = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              eightBall.setImageResource(eightBallArray[ rng.nextInt(5)]);
            }
        });
    }
}
