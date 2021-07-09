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

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<String> rvData;
    private Context context;

    public RecyclerAdapter(List<String> rvData, Context context) {
        this.rvData = rvData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /* Set Data Holder setelah inisiasi di class ViewHolder Bawah */
        holder.tvData.setText(rvData.get(position));
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvData;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            /* Inisiasi id dari layout view */
            tvData = itemView.findViewById(R.id.tv_item_data);
        }
    }
}
