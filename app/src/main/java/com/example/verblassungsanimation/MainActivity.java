package com.example.verblassungsanimation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView catimageView = findViewById(R.id.cat);
        catimageView.setX(-1000); // setX -> Position bei Start

        catimageView.animate().translationXBy(1000).rotation(1080).setDuration(2000);
        // translation -> wohin wird bewegt? / rotation -> rotiert / Duration -> in welcher zeit
    }

    public void fade(View view) {

        Log.i("Info", "ImageView berührt!");

        ImageView catimageView = findViewById(R.id.cat);

        catimageView.animate().translationXBy(1000).rotationX(-1000).setDuration(2000);


    }

}
