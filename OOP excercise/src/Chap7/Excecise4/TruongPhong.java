package Chap7.Excecise4;

public class TruongPhong extends NhanVienCoHuu{
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien , luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }
    public double tinhLuong(){
        double luong =this.getLuongCoBan()* this.getHeSoLuong() +this.phuCap;
        return luong;
    }
    public void inTTin(){
        System.out.println("Ten: "+this.getTenNhanVien()+", luong co ban: "+this.getLuongCoBan()+", he so luong: "+this.getHeSoLuong()+",phu cap: "+phuCap+",so nam duong chuc: "+soNamDuongChuc);
    }
}
