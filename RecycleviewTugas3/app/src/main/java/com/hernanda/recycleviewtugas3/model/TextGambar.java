package com.hernanda.recycleviewtugas3.model;

public class TextGambar {
    String nama, khasiat;
    int urutan;

    public TextGambar(String nama, String khasiat, int urutan) {
        this.nama = nama;
        this.khasiat = khasiat;
        this.urutan = urutan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKhasiat() {
        return khasiat;
    }

    public void setKhasiat(String khasiat) {
        this.khasiat = khasiat;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }
}
