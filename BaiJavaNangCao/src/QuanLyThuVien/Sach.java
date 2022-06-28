package QuanLyThuVien;


public class Sach extends TAILIEU{
    protected String tacGia;
    protected String nhaXB;
    protected int namXB;

    public Sach(String maTL, String tenTL, String vitri, String tacGia, String nhaXB, int namXB) {
        super(maTL, tenTL,vitri);
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
    }
    @Override
    public String loaiTL() {
        return "Sach";
    }

    public void hienThi() {
        super.hienThi();
        System.out.println(" - Tac gia: " + tacGia + " - Nha xuat ban: " + nhaXB + " - Nam xuat ban: " + namXB);
    }
}