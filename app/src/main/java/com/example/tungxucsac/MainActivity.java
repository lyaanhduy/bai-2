package com.example.tungxucsac;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgDice;
    Button btnRoll;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgDice = findViewById(R.id.imgDice);
        btnRoll = findViewById(R.id.btnRoll);
        random = new Random();

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int diceResult = random.nextInt(6) + 1;
                int resId = getResources().getIdentifier("dice" + diceResult, "drawable", getPackageName());
                imgDice.setImageResource(resId);
            }
        });
    }
}
