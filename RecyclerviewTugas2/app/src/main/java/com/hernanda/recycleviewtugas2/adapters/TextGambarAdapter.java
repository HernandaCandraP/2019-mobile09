package com.hernanda.recycleviewtugas2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hernanda.recycleviewtugas2.R;
import com.hernanda.recycleviewtugas2.models.TextGambar;

import java.util.List;

public class TextGambarAdapter extends RecyclerView.Adapter<TextGambarAdapter.MyViewHolder> {

    List<TextGambar> listbuah;

    public TextGambarAdapter(List<TextGambar> listbuah) {
        this.listbuah = listbuah;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemMobilView = layoutInflater.inflate(R.layout.buah,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(itemMobilView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        TextGambar buah = listbuah.get(position);
        holder.nama.setText("Nama BUah \t: "+buah.getNama());
        holder.vitamin.setText("Vitamin \t: "+buah.getVitamin());
        holder.gambar.setImageResource(buah.getUrutan());
    }

    @Override
    public int getItemCount() {
        return (listbuah != null) ? listbuah.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama;
        public TextView vitamin;
        public ImageView gambar;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.nama);
            vitamin = itemView.findViewById(R.id.vitamin);
            gambar = itemView.findViewById(R.id.gambar);
        }
    }
}
