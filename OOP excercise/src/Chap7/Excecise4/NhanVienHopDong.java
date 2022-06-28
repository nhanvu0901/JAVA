package Chap7.Excecise4;

public class NhanVienHopDong extends NhanVien{
    private double luongHopDong;

    public NhanVienHopDong(String tenNhanVien, double luongHopDong) {
        super(tenNhanVien);
        this.luongHopDong = luongHopDong;
    }

    public double tinhLuong() {
        return luongHopDong;
    }

    public void setLuongHopDong(double luongHopDong) {
        this.luongHopDong = luongHopDong;
    }
    public void inThongTin(){
        System.out.println("Ten: "+this.getTenNhanVien()+",luong hop dong:"+luongHopDong);
    }
}
