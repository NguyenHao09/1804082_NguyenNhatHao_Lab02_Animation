package com.example.lab02_animation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MusicMotion extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_motion);

        // here we are initializing fade animation.
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        //below methods are used for adding enter and exit transition.
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

    }
}