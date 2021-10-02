package com.example.lab02_animation;

public class Flower {
    private String ten;
    private double gia;
    private int hinh;

    public Flower(String ten, double gia, int hinh) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
