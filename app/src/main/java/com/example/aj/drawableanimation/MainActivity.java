package com.example.aj.drawableanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable adrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img=(ImageView)findViewById(R.id.img);
        img.setBackgroundResource(R.drawable.androiddef);

        adrawable=(AnimationDrawable)img.getBackground();
        adrawable.start();

    }
}
