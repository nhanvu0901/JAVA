package Chap7.Excecise4;

public class NhanVien {
    private String tenNhanVien;

    public double LUONG_MAX;

    public NhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public NhanVien() {

    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public double getLUONG_MAX() {
        return LUONG_MAX;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public double tinhLuong(){
        return 0.0;
    }

    public void inThongTin(){
        System.out.println("Ten: "+tenNhanVien);
    }



}
