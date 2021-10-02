package com.example.lab02_animation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class RecycleViewAdapter_Music extends RecyclerView.Adapter<RecycleViewAdapter_Music.RecycleViewHolder> {
    private LinkedList<Music> list;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public RecycleViewAdapter_Music(LinkedList<Music> music, Context context, Activity activity) {
        inflater = LayoutInflater.from(context);
        this.list = music;
        this.context = context;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.music, parent, false);
        return new RecycleViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        Music music = list.get(position);
        holder.tvTenMusic.setText(music.getTen());
        holder.tvSinger.setText(music.getSinger());
        holder.imgMusic.setImageResource(music.getHinh());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private RecycleViewAdapter_Flower adapter;
        public TextView tvTenMusic;
        public TextView tvSinger;
        public ImageView imgMusic;

        public RecycleViewHolder(View view, RecycleViewAdapter_Music recycleViewAdapter_music) {
            super(view);
            tvTenMusic = view.findViewById(R.id.rv_TenMusic);
            tvSinger = view.findViewById(R.id.rv_Singer);
            imgMusic = view.findViewById(R.id.rv_imgMusic);
            this.adapter = adapter;

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
//            int i = getLayoutPosition();
//            Music music = list.get(i);
            Intent intent = new Intent(context, MusicMotion.class);
//            intent.putExtra("ten", music.getTen());
//            intent.putExtra("singer", music.getSinger());
//            intent.putExtra("hinh", music.getHinh());

            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            (Activity) context, imgMusic,
                            ViewCompat.getTransitionName(imgMusic));
            context.startActivity(intent, options.toBundle());
            notifyDataSetChanged();
        }
    }
}
