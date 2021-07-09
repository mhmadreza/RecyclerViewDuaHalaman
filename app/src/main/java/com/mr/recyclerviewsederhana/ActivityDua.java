package com.mr.recyclerviewsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mr.recyclerviewsederhana.adapter.RecyclerAdapter;
import com.mr.recyclerviewsederhana.adapter.RecyclerDuaAdapter;

import java.util.ArrayList;
import java.util.List;

public class ActivityDua extends AppCompatActivity {

    private RecyclerView rvLayDua;
    private RecyclerDuaAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> listDataDua = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        setUIDua();
    }

    private void setUIDua() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Halaman 2");

        /* Inisiasi Variabel Diatas */
        rvLayDua = findViewById(R.id.rv_data_dua);
        rvLayDua.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvLayDua.setLayoutManager(layoutManager);
        listDataDua.add("Ini Data 2 - 1");
        listDataDua.add("Ini Data 2 - 2");
        listDataDua.add("Ini Data 2 - 3");
        listDataDua.add("Ini Data 2 - 4");
        listDataDua.add("Ini Data 2 - 5");
        adapter = new RecyclerDuaAdapter(listDataDua, this);
        rvLayDua.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}