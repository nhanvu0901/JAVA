package QuanLyThuVien;

public class TAPCHI extends TAILIEU{
    protected String chuyenNganh;
    protected int so;
    protected int nam;

    public TAPCHI(String maTL, String tenTL, String vitri, String chuyenNganh, int so, int nam) {
        super(maTL, tenTL,vitri);
        this.chuyenNganh = chuyenNganh;
        this.so = so;
        this.nam = nam;
    }

    public String loaiTL() {
        return "Tap chi";
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" - Tap chi chuyen nganh: " + chuyenNganh + " - So ra: " + so + " - Nam: " + nam);
    }
}