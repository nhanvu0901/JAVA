package QuanLyThuVien;

public class CD extends TAILIEU{
    protected int soTT;
    protected String noiDung;

    public CD(String maTL, String tenTL, String vitri, int soTT, String noiDung) {
        super(maTL, tenTL,vitri);
        this.soTT = soTT;
        this.noiDung = noiDung;
    }

    public String loaiTL() {
        return "CD";
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" - So thu tu: " + soTT + " - Noi dung: " + noiDung);
    }
}