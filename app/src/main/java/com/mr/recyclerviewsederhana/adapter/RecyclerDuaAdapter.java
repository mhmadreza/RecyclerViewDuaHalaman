package com.mr.recyclerviewsederhana.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mr.recyclerviewsederhana.R;

import java.util.List;

public class RecyclerDuaAdapter extends RecyclerView.Adapter<RecyclerDuaAdapter.ViewHolder> {

    private List<String> rvDua;
    private Context context;

    public RecyclerDuaAdapter(List<String> rvDua, Context context) {
        this.rvDua = rvDua;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data_dua, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvDua.setText(rvDua.get(position));
    }

    @Override
    public int getItemCount() {
        return rvDua.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvDua;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDua = itemView.findViewById(R.id.tv_item_data_2);
        }
    }
}
