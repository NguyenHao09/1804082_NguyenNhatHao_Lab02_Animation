package com.example.lab02_animation;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class Lavender extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lavender);

        Intent intent = getIntent();
        //phần recycle view
//        String ten = intent.getStringExtra("ten");
//        double gia = intent.getDoubleExtra("gia", R.id.rv_GiaFl);
        int hinh = intent.getIntExtra("hinh", R.id.rv_imgFl);

        //phần view
//        ((TextView)findViewById(R.id.tvTenFl).setText(ten);
//        ((TextView)findViewById(R.id.tvGiaFl).setText("$" + String.valueOf(gia));
        ((ImageView)findViewById(R.id.imgFl)).setImageResource(hinh);


        // here we are initializing fade animation.
        Fade fade = new Fade();
        View decor = getWindow().getDecorView();

        //below methods are used for adding enter and exit transition.
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        findViewById(R.id.btBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ListFlower.class));

                overridePendingTransition(R.anim.back_enter, R.anim.back_exit);


            }
        });
    }
}