package Tuan2.Bai3;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public double LUONG_MAX;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }
    public double tinhLuong(){
        return this.getLuongCoBan() * this.getHeSoLuong();
    }
    public boolean tangLuong(double heso){

        this.setHeSoLuong(this.heSoLuong + heso);
        double luong = this.tinhLuong();

        if(luong > LUONG_MAX){
            System.out.println("Luong bigger than Luong max");
            return false;
        }
        return true;
    }
    public void inTTin(){
        System.out.println("Ten: "+tenNhanVien+", luong co ban: "+luongCoBan+", he so luong: "+heSoLuong+", luong max: "+LUONG_MAX);
    }

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Nhan Vu",100000,0.5,200000);
        nhanVien1.tangLuong(1);

        System.out.println(nhanVien1.tinhLuong());
    }
}
