package QuanLyThuVien2;

public class CD extends TaiLieu{
    public int stt;
    public String noiDung;

    public CD(String maTL, String tenTL, String vitri, int stt, String nd) {
        super(maTL, tenTL, vitri);
        this.stt = stt;
        this.noiDung = nd;
    }
    @Override
    public String Loai() {
        return "CD";
    }
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(" - So thu tu: " + stt + " - Noi dung: " + noiDung);
    }
}
