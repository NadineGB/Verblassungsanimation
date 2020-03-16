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
    }

    public void animate(View view) {

        Log.i("Info", "ImageView berührt!");

        ImageView bearimageView = findViewById(R.id.bear);
        ImageView catimageView = findViewById(R.id.cat);

        // bearimageView.animate().translationXBy(-500).setDuration(2000); //Image verschiebt sich nach links bei minus (rechts bei plus) Y-Achse verschiebt sich nach oben/unten

        catimageView.animate().rotation(1000).alpha(0).setDuration(2000); //lässt Image rotieren

        bearimageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000); // skaliert das Image kleiner


    }

}
