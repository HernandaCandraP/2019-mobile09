package com.hernanda.recyclerviewtugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.hernanda.recyclerviewtugas.adapters.TextGambarAdapter;
import com.hernanda.recyclerviewtugas.models.TextGambar;

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

        TextGambar presiden = new TextGambar("1. Soekarno", R.drawable.soekarno);
        listTextGambar.add(presiden);

        presiden = new TextGambar("2. Soeharto", R.drawable.suharto);
        listTextGambar.add(presiden);

        presiden = new TextGambar("3. Bacharuddin Yusuf Habibie", R.drawable.bacharuddin_jusuf_habibie);
        listTextGambar.add(presiden);

        presiden = new TextGambar("4. Abdurrahman Wahid", R.drawable.abdurrahman_wahid);
        listTextGambar.add(presiden);

        presiden = new TextGambar("5. Megawati Soekarnoputri", R.drawable.megawati_sukarnoputri);
        listTextGambar.add(presiden);

        presiden = new TextGambar("6. Susilo Bambang Yudhoyono", R.drawable.susilo_bambang_yudhoyono);
        listTextGambar.add(presiden);

        presiden = new TextGambar("7. Joko Widodo", R.drawable.joko_widodo);
        listTextGambar.add(presiden);

        TextGambarAdapter presidenadapter = new TextGambarAdapter(listTextGambar);
        rvTextGambar.setAdapter(presidenadapter);
        rvTextGambar.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
