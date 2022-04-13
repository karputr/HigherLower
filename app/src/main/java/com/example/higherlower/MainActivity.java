package com.example.higherlower;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void randomNumberGenerator() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }

    public void onGuess(View view) {
        String message;
        try {


            EditText editTextNumber = (EditText) findViewById(R.id.inputNumber);

            int guessedNumber = Integer.parseInt(editTextNumber.getText().toString());

            if (guessedNumber < randomNumber)
                message = "Higher!";
            else if (guessedNumber > randomNumber)
                message = "Lower!";
            else {
                message = "You got me!";
                randomNumberGenerator();
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }catch (Exception e) {
            message="Input Number!";
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }
}