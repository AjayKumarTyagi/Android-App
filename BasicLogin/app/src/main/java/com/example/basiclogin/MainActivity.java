package com.example.basiclogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view)
    {
        EditText email= (EditText) findViewById(R.id.editText);
        EditText passwd= (EditText) findViewById(R.id.editText2);

        Log.i("Info","logged in");
        Log.i("email", email.getText().toString());
        Log.i("password", passwd.getText().toString());

        Toast.makeText(this, "logged in: "+email.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
