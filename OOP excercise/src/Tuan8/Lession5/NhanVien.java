package Tuan8.Lession5;



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

    public NhanVien() {

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

    public void inTTin(){
        System.out.println("Ten: "+tenNhanVien+", luong co ban: "+luongCoBan+", he so luong: "+heSoLuong+", luong max: "+LUONG_MAX);
    }
    public double tangHeSoLuong(double heso){
        return this.heSoLuong += heso;
    }

    public static double sumOfSalary(Tuan8.Lession4.Excersise2.NhanVien[] nhanViens){
        Double sumSalary =0.0 ;
        for (int i = 0; i < nhanViens.length; i++) {
            sumSalary += nhanViens[i].tinhLuong();
        }
        return sumSalary;
    }
}
