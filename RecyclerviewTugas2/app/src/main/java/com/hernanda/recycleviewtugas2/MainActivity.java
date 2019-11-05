package com.hernanda.recycleviewtugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hernanda.recycleviewtugas2.adapters.TextGambarAdapter;
import com.hernanda.recycleviewtugas2.models.TextGambar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvTextGambar;
    List<TextGambar> listTextGambar = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTextGambar = findViewById(R.id.rvTextGambar);

        TextGambar buah = new TextGambar("Apel", "C, B6, B1", R.drawable.apel);
        listTextGambar.add(buah);

        buah = new TextGambar("Jeruk", "C, B1, A", R.drawable.jeruk);
        listTextGambar.add(buah);

        buah = new TextGambar("Pisang", "B6, C", R.drawable.pisang);
        listTextGambar.add(buah);

        buah = new TextGambar("Semangka", "A, B6, C", R.drawable.semangka);
        listTextGambar.add(buah);

        buah = new TextGambar("Anggur", "C, A, B1, B2", R.drawable.anggur);
        listTextGambar.add(buah);

        TextGambarAdapter buahadapter = new TextGambarAdapter(listTextGambar);
        rvTextGambar.setAdapter(buahadapter);
        rvTextGambar.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
