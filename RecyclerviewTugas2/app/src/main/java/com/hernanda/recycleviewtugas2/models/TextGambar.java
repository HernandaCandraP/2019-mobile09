package com.hernanda.recycleviewtugas2.models;

public class TextGambar {
    String nama, vitamin;
    int urutan;

    public TextGambar(String nama, String vitamin, int urutan) {
        this.nama = nama;
        this.vitamin = vitamin;
        this.urutan = urutan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    public int getUrutan() {
        return urutan;
    }

    public void setUrutan(int urutan) {
        this.urutan = urutan;
    }
}
