package com.mr.recyclerviewsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mr.recyclerviewsederhana.adapter.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvRecycler;
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> dataList = new ArrayList<>();
    private Button btnPindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecycler = findViewById(R.id.rv_Data);
        rvRecycler.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvRecycler.setLayoutManager(layoutManager);
        dataList.add("Halo");
        dataList.add("Halo 2");
        dataList.add("Halo 3");
        dataList.add("Halo 4");
        adapter = new RecyclerAdapter(dataList, this);
        rvRecycler.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        /* Btn Pindah */
        btnPindah = (Button)findViewById(R.id.btn_pindah);
        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityDua.class));
            }
        });
    }
}