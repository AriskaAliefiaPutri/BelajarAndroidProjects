package com.example.sqlitedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BarangAdapter extends RecyclerView.Adapter <BarangAdapter.VielHolder> {

    Context context;
    List<Barang> barangList;

    public BarangAdapter(Context context, List<Barang> barangList) {
        this.context = context;
        this.barangList = barangList;
    }

    @NonNull
    @Override
    public VielHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_barang,viewGroup,false);
        return new VielHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull VielHolder vielHolder, int i) {
        vielHolder.tvBarang.setText(barangList.get(i).getBarang());
        vielHolder.tvStok.setText(barangList.get(i).getStok());
        vielHolder.tvHarga.setText(barangList.get(i).getHarga());
    }

    @Override
    public int getItemCount() {
        return barangList.size();
    }

    public class VielHolder extends RecyclerView.ViewHolder {

        TextView tvBarang, tvStok, tvHarga, tvMenu;

        public VielHolder(@NonNull View itemView) {
            super(itemView);

            tvBarang = itemView.findViewById(R.id.tvBarang);
            tvStok = itemView.findViewById(R.id.tvStok);
            tvHarga = itemView.findViewById(R.id.tvHarga);
            tvMenu = itemView.findViewById(R.id.tvMenu);
        }
    }
}
