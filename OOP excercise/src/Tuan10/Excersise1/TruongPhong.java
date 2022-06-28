package Tuan10.Excersise1;

public class TruongPhong extends NhanVien{
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, luongCoBan, heSoLuong, LUONG_MAX);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    public double tinhLuong(){
        double luong =this.luongCoBan*this.heSoLuong +this.phuCap;
        return luong;
    }
    public void inTTin(){
        System.out.println("Ten: "+tenNhanVien+", luong co ban: "+luongCoBan+", he so luong: "+heSoLuong+", luong max: "+LUONG_MAX+",phu cap: "+phuCap+",so nam duong chuc: "+soNamDuongChuc);
    }
}
