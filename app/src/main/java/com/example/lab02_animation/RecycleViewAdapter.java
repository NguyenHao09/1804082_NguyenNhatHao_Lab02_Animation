//package com.example.lab02_animation;
//
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.LinkedList;
//
//public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewHolder> {
//
//    private LinkedList<CaiGhe> list;
//    private LayoutInflater inflater;
//    private Context context;
//
//    public RecycleViewAdapter(LinkedList<CaiGhe> list, Context context) {
//        inflater = LayoutInflater.from(context);
//        this.list = list;
//        this.context = context;
//    }
//
//    @NonNull
//    @Override
//    public com.example.lab02_animation.RecycleViewAdapter.RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = inflater.inflate(R.layout.List, parent, false);
//        return new RecycleViewHolder(view, this);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecycleViewHolder holder, int position) {
//        CaiGhe ghe = list.get(position);
//        holder.tvTenSP.setText(ghe.getTen());
//        holder.tvGiaSP.setText("$" + String.valueOf(ghe.getGia()));
//        holder.imgSP.setImageResource(ghe.getHinh());
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
//
//    public void filterList(LinkedList<CaiGhe> linkedList) {
//        list = linkedList;
//        notifyDataSetChanged();
//    }
//
//    public class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//        private com.example.caighe.RecycleViewAdapter adapter;
//        public TextView tvTenSP;
//        public TextView tvGiaSP;
//        public ImageView imgSP;
//
//        public RecycleViewHolder(View view, com.example.caighe.RecycleViewAdapter adapter) {
//            super(view);
//            tvTenSP = view.findViewById(R.id.tvTenSP);
//            tvGiaSP = view.findViewById(R.id.tvGiaSP);
//            imgSP = view.findViewById(R.id.imgSP);
//            this.adapter = adapter;
//
//            view.setOnClickListener(this);
//        }
//
//        @Override
//        public void onClick(View v) {
//            int i = getLayoutPosition();
//            CaiGhe ghe = list.get(i);
//            Intent intent = new Intent(context, Screen2.class);
//            intent.putExtra("ten", ghe.getTen());
//            intent.putExtra("gia", ghe.getGia());
//            intent.putExtra("hinh", ghe.getHinh());
//            context.startActivity(intent);
//            notifyDataSetChanged();
//        }
//    }
//}
