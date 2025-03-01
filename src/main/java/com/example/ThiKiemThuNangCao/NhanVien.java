package com.example.ThiKiemThuNangCao;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private  String phongBan;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien(String maNV, String tenNV, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    public NhanVien(String tenNV, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", tenNV='" + tenNV + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                ", soNamLamViec=" + soNamLamViec +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
