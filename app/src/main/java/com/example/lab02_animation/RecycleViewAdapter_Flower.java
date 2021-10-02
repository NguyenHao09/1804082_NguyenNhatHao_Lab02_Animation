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

public class RecycleViewAdapter_Flower extends RecyclerView.Adapter<RecycleViewAdapter_Flower.RecycleViewHolder> {

    private LinkedList<Flower> list;
    private LayoutInflater inflater;
    private Context context;
    private Activity activity;

    public RecycleViewAdapter_Flower(LinkedList<Flower> flowers, Context context, Activity activity) {
        inflater = LayoutInflater.from(context);
        this.list = flowers;
        this.context = context;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecycleViewAdapter_Flower.RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.flower, parent, false);
        return new RecycleViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
        Flower flower = list.get(position);
        holder.tvTenFl.setText(flower.getTen());
        holder.tvGiaFl.setText("$" + String.valueOf(flower.getGia()));
        holder.imgFl.setImageResource(flower.getHinh());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

//    public void filterList(LinkedList<Flower> linkedList) {
//        list = linkedList;
//        notifyDataSetChanged();
//    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private RecycleViewAdapter_Flower adapter;
        public TextView tvTenFl;
        public TextView tvGiaFl;
        public ImageView imgFl;

        public RecycleViewHolder(View view, RecycleViewAdapter_Flower adapter) {
            super(view);
            tvTenFl = view.findViewById(R.id.rv_TenFl);
            tvGiaFl = view.findViewById(R.id.rv_GiaFl);
            imgFl = view.findViewById(R.id.rv_imgFl);
            this.adapter = adapter;

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int i = getLayoutPosition();
            Flower flower = list.get(i);
            Intent intent = new Intent(context, Lavender.class);
//            intent.putExtra("ten", flower.getTen());
//            intent.putExtra("gia", flower.getGia());
            intent.putExtra("hinh", flower.getHinh());

            ActivityOptionsCompat options =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            (Activity) context, imgFl,
                            ViewCompat.getTransitionName(imgFl));
            context.startActivity(intent, options.toBundle());
            notifyDataSetChanged();
        }
    }
}
