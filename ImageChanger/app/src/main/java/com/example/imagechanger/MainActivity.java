package com.example.imagechanger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void ImageChange(View view)
    {
        Log.i("Info","Clicked");

        ImageView image = (ImageView) findViewById(R.id.pugimage);
        image.setImageResource(R.drawable.pug2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
