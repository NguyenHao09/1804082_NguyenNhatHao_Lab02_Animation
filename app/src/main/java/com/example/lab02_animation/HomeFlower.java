package com.example.lab02_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeFlower extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_flower);

        findViewById(R.id.btGo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(HomeFlower.this,
                        ListFlower.class));

                overridePendingTransition(R.anim.enter_x, R.anim.exit_x);

            }
        });
    }
}