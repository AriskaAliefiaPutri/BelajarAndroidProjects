package com.example.sqlitedatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

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

        vielHolder.tvMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu =new PopupMenu(context, vielHolder.tvMenu);
                popupMenu.inflate(R.menu.menu_item);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int menuItemId = menuItem.getItemId();
                        if (menuItemId == R.id.ubah) {
                            Toast.makeText(context, "UBAH", Toast.LENGTH_SHORT).show();
                            ((MainActivity)context).selectUpdate(barangList.get(i).getIdbbarang());
                        } else {
                            Toast.makeText(context,"HAPUS", Toast.LENGTH_SHORT ).show();
                            ((MainActivity)context).deleteData(barangList.get(i).getIdbbarang());
                        }
                        return false;
                    }
                });

                popupMenu.show();
            }
        });
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
