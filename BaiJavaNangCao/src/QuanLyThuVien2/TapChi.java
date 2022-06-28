package QuanLyThuVien2;

public class TapChi extends TaiLieu {
    protected String chuyenNganh;
    protected int so;
    protected int nam;

    public TapChi(String maTL, String tenTL, String vitri, String chuyenNganh, int so, int nam) {
        super(maTL, tenTL,vitri);
        this.chuyenNganh = chuyenNganh;
        this.so = so;
        this.nam = nam;
    }

    @Override
    public String Loai() {
        return "Tap chi";
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" - Tap chi chuyen nganh: " + chuyenNganh + " - So ra: " + so + " - Nam: " + nam);
    }
}
