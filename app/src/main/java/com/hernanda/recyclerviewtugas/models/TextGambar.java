package com.hernanda.recyclerviewtugas.models;

public class TextGambar {

    public String namaPrseiden;
    public int urutanPrasiden;

    public String getNamaPrseiden() {
        return namaPrseiden;
    }

    public void setNamaPrseiden(String namaPrseiden) {
        this.namaPrseiden = namaPrseiden;
    }

    public int getUrutanPrasiden() {
        return urutanPrasiden;
    }

    public void setUrutanPrasiden(int urutanPrasiden) {
        this.urutanPrasiden = urutanPrasiden;
    }

    public TextGambar(String namaPrseiden, int urutanPrasiden) {
        this.namaPrseiden = namaPrseiden;
        this.urutanPrasiden = urutanPrasiden;
    }
}
