package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int random;
    public void guess(View view){

        EditText number = (EditText) findViewById(R.id.editText);
        String num = number.getText().toString();
        int guessNum = Integer.parseInt(num);
        String message;
        if(guessNum<random){
            message="higher";
        }
        else if(guessNum>random){
            message="lower";
        }
        else if(guessNum==random){
            message="bravo!";
        }
        else
            message="invalid guess";
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();

        Log.i("button pressed", "button pressed");
        Log.i("random number",number.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        random = rand.nextInt(21)+1;
    }
}
