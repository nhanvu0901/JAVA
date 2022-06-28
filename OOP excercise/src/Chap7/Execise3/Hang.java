package Chap7.Execise3;

public abstract class Hang {
    private int maHang;
    private String tenHang;
    private String nhaSanXuat;
    private double gia;

    public Hang(int maHang, String tenHang, String nhaSanXuat, double gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhaSanXuat = nhaSanXuat;
        this.gia = gia;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public abstract void printInfo();
}
