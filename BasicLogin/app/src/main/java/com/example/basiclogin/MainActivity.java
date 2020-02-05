package com.example.basiclogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void login(View view)
    {
        EditText email= (EditText) findViewById(R.id.editText);
        EditText passwd= (EditText) findViewById(R.id.editText2);

        Log.i("Info","logged in");
        Log.i("email", email.getText().toString());
        Log.i("password", passwd.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
