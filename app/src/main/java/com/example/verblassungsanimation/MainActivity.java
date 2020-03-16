package com.example.verblassungsanimation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    boolean bearshowing = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fade(View view) {

        Log.i("Info", "ImageView berührt!");

        ImageView bearimageView = findViewById(R.id.bear);
        ImageView catimageView = findViewById(R.id.cat);

        if (bearshowing) {
            bearshowing = false;
            bearimageView.animate().alpha(0).setDuration(2000);
            catimageView.animate().alpha(1).setDuration(2000);
        } else {
            bearshowing = true;
            bearimageView.animate().alpha(1).setDuration(2000);
            catimageView.animate().alpha(0).setDuration(2000);
        }

    }

}
