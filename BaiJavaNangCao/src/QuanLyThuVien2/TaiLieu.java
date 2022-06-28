package QuanLyThuVien2;

public abstract class TaiLieu {
    protected String maTL;
    protected String tenTL;
    protected String vitri;

    public abstract  String Loai();


    public TaiLieu(String maTL, String tenTL, String vitri) {
        this.maTL = maTL;
        this.tenTL= tenTL;
        this.vitri = vitri;
    }
    public void hienThi() {
        System.out.print("Ma tai lieu: " + maTL + " - Ten tai lieu: " + tenTL + " - Vi tri: " + vitri);
    }
}
