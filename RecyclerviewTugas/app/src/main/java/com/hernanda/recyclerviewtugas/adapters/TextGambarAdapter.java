package com.hernanda.recyclerviewtugas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hernanda.recyclerviewtugas.R;
import com.hernanda.recyclerviewtugas.models.TextGambar;

import java.util.List;

public class TextGambarAdapter extends RecyclerView.Adapter<TextGambarAdapter.MyViewHolder> {

    List<TextGambar> listpresiden;

    public TextGambarAdapter(List<TextGambar> listpresiden){
        this.listpresiden = listpresiden;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.presiden,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TextGambar presiden = listpresiden.get(position);
        holder.nama.setText(presiden.getNamaPrseiden());
        holder.gambar.setImageResource(presiden.getUrutanPrasiden());
    }

    @Override
    public int getItemCount() {
        return (listpresiden != null) ? listpresiden.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
