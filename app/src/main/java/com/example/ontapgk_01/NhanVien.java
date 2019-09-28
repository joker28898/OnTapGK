package com.example.ontapgk_01;

import androidx.annotation.NonNull;

public class NhanVien {
    private String MaNV, TenNV;
    private boolean GioiTinh;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public NhanVien(String maNV, String tenNV, boolean gioiTinh) {
        MaNV = maNV;
        TenNV = tenNV;
        GioiTinh = gioiTinh;
    }
    public NhanVien() {

    }

    @NonNull
    @Override
    public String toString() {
        return this.MaNV + " - " + this.TenNV;
    }
}
