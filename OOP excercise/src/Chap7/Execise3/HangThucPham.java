package Chap7.Execise3;

import java.util.Date;

public class HangThucPham extends Hang{
    private double giaNgaySanXuat;
    private String ngayHetHan;

    public HangThucPham(int maHang, String tenHang, String nhaSanXuat, double gia, double giaNgaySanXuat, String ngayHetHan) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.giaNgaySanXuat = giaNgaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public void printInfo() {
        System.out.println("Ma hang: "+this.getMaHang()+",ten hang: "+this.getTenHang()+",nha san xuat: "+this.getNhaSanXuat()+",gia: "+this.getGia()+",gia ngay san xuat:"+giaNgaySanXuat+",ngay het han: "+ngayHetHan);
    }

}
