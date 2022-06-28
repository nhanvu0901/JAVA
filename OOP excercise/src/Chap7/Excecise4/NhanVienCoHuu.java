package Chap7.Excecise4;

public class NhanVienCoHuu extends NhanVien{
    private double luongCoBan;
    private double heSoLuong;


    public NhanVienCoHuu(String tenNhanVien, double luongCoBan, double heSoLuong) {
        super(tenNhanVien);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
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

    public double tangHeSoLuong(double heso){
        return this.heSoLuong += heso;
    }
    public double tinhLuong(){
        return this.getLuongCoBan() * this.getHeSoLuong();
    }
    public void inThongTin(){
        System.out.println("Ten: "+this.getTenNhanVien()+",luong co ban: "+luongCoBan+",he so luong: "+heSoLuong);
    }
}
