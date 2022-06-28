package Chap7.Execise3;

public class HangSanhSu extends Hang{
    private String loaiNguyenLieu;

    public HangSanhSu(int maHang, String tenHang, String nhaSanXuat, double gia, String loaiNguyenLieu) {
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu = loaiNguyenLieu;
    }

    @Override
    public void printInfo() {
        System.out.println("Ma hang: "+this.getMaHang()+",ten hang: "+this.getTenHang()+",nha san xuat: "+this.getNhaSanXuat()+",gia: "+this.getGia()+",loai nguyen lieu:"+loaiNguyenLieu);
    }
}
