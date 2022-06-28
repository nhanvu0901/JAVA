package QuanLyThuVien;

public abstract class TAILIEU {
    protected String maTL;
    protected String tenTL;
    protected String vitri;

    public TAILIEU(String maTL, String tenTL, String vitri) {
        this.maTL = maTL;
        this.tenTL= tenTL;
        this.vitri = vitri;
    }

    public abstract   String loaiTL();

    public void hienThi() {
        System.out.print("Ma tai lieu: " + maTL + " - Ten tai lieu: " + tenTL + " - Vi tri: " + vitri);
    }
}