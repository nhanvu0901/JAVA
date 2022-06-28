package Chap7.Execise3;

public class HangDienMay extends Hang{
    private int thoiGianBaoHanh;
    private double dienAp;
    private double congSuat;

    public HangDienMay(int maHang, String tenHang, String nhaSanXuat, double gia, int thoiGianBaoHanh, double dienAp, double congSuat) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.dienAp = dienAp;
        this.congSuat = congSuat;
    }

    @Override
    public void printInfo() {
        System.out.println("Ma hang: "+this.getMaHang()+",ten hang: "+this.getTenHang()+",nha san xuat: "+this.getNhaSanXuat()+",gia: "+this.getGia()+",dien ap: "+dienAp+",cong suat: "+congSuat);
    }
}
