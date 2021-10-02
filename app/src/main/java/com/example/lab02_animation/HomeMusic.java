package com.example.lab02_animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class HomeMusic extends AppCompatActivity {
    RecyclerView rv_Music;
    RecycleViewAdapter_Music adapter;
    LinkedList<Music> music = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_music);

        rv_Music = findViewById(R.id.rv_Music);

        music.add(new Music("Love Story", "Taylor Swift", R.drawable.taylor));
        music.add(new Music("Love Story2", "Taylor Swift2", R.drawable.taylor));
        music.add(new Music("Love Story3", "Taylor Swift3", R.drawable.taylor));
        music.add(new Music("Love Story", "Taylor Swift", R.drawable.taylor));
        music.add(new Music("Love Story", "Taylor Swift", R.drawable.taylor));
        music.add(new Music("Love Story", "Taylor Swift", R.drawable.taylor));


        adapter = new RecycleViewAdapter_Music(music, this,this);
        rv_Music.setAdapter(adapter);
        rv_Music.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }
}