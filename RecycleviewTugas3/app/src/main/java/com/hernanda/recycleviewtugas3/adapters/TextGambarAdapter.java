package com.hernanda.recycleviewtugas3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hernanda.recycleviewtugas3.R;
import com.hernanda.recycleviewtugas3.model.TextGambar;

import java.util.List;

public class TextGambarAdapter extends RecyclerView.Adapter<TextGambarAdapter.MyViewHolder> {

    List<TextGambar> listsayur;

    public TextGambarAdapter(List<TextGambar> listsayur) {
        this.listsayur = listsayur;
    }

    @NonNull
    @Override
    public TextGambarAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.sayur,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TextGambarAdapter.MyViewHolder holder, int position) {
        TextGambar sayur = listsayur.get(position);
        holder.nama.setText(sayur.getNama());
        holder.khasiat.setText(sayur.getKhasiat());
        holder.gambar.setImageResource(sayur.getUrutan());
    }

    @Override
    public int getItemCount() {
        return (listsayur != null) ? listsayur.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama, khasiat;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.sayur);
            khasiat = itemView.findViewById(R.id.khasiat);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
