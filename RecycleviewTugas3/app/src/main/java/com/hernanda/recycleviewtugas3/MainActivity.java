package com.hernanda.recycleviewtugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hernanda.recycleviewtugas3.adapters.TextGambarAdapter;
import com.hernanda.recycleviewtugas3.model.TextGambar;

import org.w3c.dom.Text;

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

        TextGambar sayur = new TextGambar("1. Bayam", "Mencegah penyakit kanker", R.drawable.bayam);
        listTextGambar.add(sayur);
        sayur = new TextGambar("2. Brokoli", "Bagus untuk kesehatan badan dan kulit ", R.drawable.brokoli);
        listTextGambar.add(sayur);
        sayur = new TextGambar("3. Terong", "Menangkal radikal bebas ", R.drawable.terong);
        listTextGambar.add(sayur);
        sayur = new TextGambar("4. Wortel", "Kesehatan mata ", R.drawable.wortel);
        listTextGambar.add(sayur);
        sayur = new TextGambar("5. Tomat", "Mampu mencegah diabetes ", R.drawable.tomat);
        listTextGambar.add(sayur);
        sayur = new TextGambar("6. Paprika", "Sembuhkan rambut rontok", R.drawable.paprika);
        listTextGambar.add(sayur);

        TextGambarAdapter sayuradapter = new TextGambarAdapter(listTextGambar);
        rvTextGambar.setAdapter(sayuradapter);
        rvTextGambar.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
