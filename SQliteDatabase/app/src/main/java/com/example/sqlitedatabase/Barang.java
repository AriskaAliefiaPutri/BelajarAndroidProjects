package com.example.sqlitedatabase;

public class Barang {

    private String idbbarang, barang, stok, harga;

    public Barang(String idbbarang, String barang, String stok, String harga) {
        this.idbbarang = idbbarang;
        this.barang = barang;
        this.stok = stok;
        this.harga = harga;
    }

    public String getIdbbarang() {
        return idbbarang;
    }

    public void setIdbbarang(String idbbarang) {
        this.idbbarang = idbbarang;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
}
