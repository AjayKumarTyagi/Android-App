package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void CurrencyConverter(View view){

        Log.i("Info", "Button pressed");
        EditText rupees = (EditText) findViewById(R.id.rupees);
        String amount1 = rupees.getText().toString();
        double amount2 = Double.parseDouble(amount1);
        double dollars1 = amount2 * 73;
        String dollars = String.format("%.2f", dollars1);
        Log.i("Dollars: ", dollars);
        Toast.makeText(this, "Rs "+amount1+" = "+dollars+" $", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
