package com.example.lab02_animation;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class ListFlower extends AppCompatActivity {

    RecyclerView rv_Flower;
    RecycleViewAdapter_Flower adapter;
    LinkedList<Flower> flowers = new LinkedList<>();
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_flower);

        rv_Flower = findViewById(R.id.rv_Flower);

        flowers.add(new Flower("Lavender", 25 , R.drawable.biglavender));
        flowers.add(new Flower("Tree", 35 , R.drawable.tree));
        flowers.add(new Flower("Light Lavender", 25 , R.drawable.light_lavender));
        flowers.add(new Flower("Lavender", 25 , R.drawable.lavender));
        flowers.add(new Flower("Tree", 35 , R.drawable.tree));
        flowers.add(new Flower("Lavender", 25 , R.drawable.biglavender));
        flowers.add(new Flower("Tree", 35 , R.drawable.tree));

        adapter = new RecycleViewAdapter_Flower(flowers, this, this);
        rv_Flower.setAdapter(adapter);
        rv_Flower.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));







//// we are adding fade animation, between two imageviews.
//        Fade fade = new Fade();
//        View decor = getWindow().getDecorView();
//
//        // we are adding fade animation for enter transition.
//        getWindow().setEnterTransition(fade);
//
//        // we are also setting fade animation for exit transition.
//        getWindow().setExitTransition(fade);
//        // initializing our imageview.
//
//        final ImageView imageView = findViewById(R.id.image);
//        // setting on click listener for our imageview.
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // and adding animation between this two activities.
//                Intent intent = new Intent(ListFlower.this,
//                        Lavender.class);
//                // below method is used to make scene transition
//                // and adding fade animation in it.
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                ListFlower.this, imageView,
//                                ViewCompat.getTransitionName(imageView));
//
//                // starting our activity with below method.
//                startActivity(intent, options.toBundle());
//            }
//        });

//        final ImageView imageView2 = findViewById(R.id.imageView2);
//        imageView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // and adding animation between this two activities.
//                Intent intent = new Intent(ListFlower.this,
//                        ShareElementActivity3.class);
//                // below method is used to make scene transition
//                // and adding fade animation in it.
//                ActivityOptionsCompat options =
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(
//                                ShareElementActitivy1.this, imageView2,
//                                ViewCompat.getTransitionName(imageView2));
//
//                // starting our activity with below method.
//                startActivity(intent, options.toBundle());
//            }
//        });
    }
}