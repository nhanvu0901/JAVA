package QuanLyThuVien2;

public class Sach extends TaiLieu {
    protected String tacGia;
    protected String nhaXB;
    protected int namXB;

    public Sach(String maTL, String tenTL, String vitri, String tacGia, String nhaXB, int namXB) {
        super(maTL, tenTL, vitri);
        this.tacGia = tacGia;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
    }

    @Override
    public String Loai() {
        return "Sach";
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" - Tac gia: " + tacGia + " - Nha xuat ban: " + nhaXB + " - Nam xuat ban: " + namXB);
    }
}

