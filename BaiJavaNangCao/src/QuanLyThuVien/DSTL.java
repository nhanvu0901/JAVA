package QuanLyThuVien;

public class DSTL {
    private TAILIEU ds[];
    private int soTL;

    public DSTL(int max) {
        soTL = 0;
        ds = new TAILIEU[max];
    }

    public void them(TAILIEU s) {
        ds[soTL++] = s;
    }

    public void lietKe() {
        for (int i = 0; i < soTL; i++) {
            ds[i].hienThi();
        }
    }

    public void lietKe(String s) {
        for (int i = 0; i < soTL; i++) {
            if (ds[i].loaiTL().equals(s))
                ds[i].hienThi();
        }
    }

    public void xem(String maTL) {
        for (int i = 0; i < soTL; i++) {
            if (ds[i].maTL.equals(maTL))
                ds[i].hienThi();
        }
    }
    // lam ep kieu de tim
    public void tim(String ten , String tacGia){
        for (int i = 0; i < soTL; i++) {
            if(ds[i].loaiTL().equals("Sach")){ // day chinh la upcasting phuong thuc con truyen du lieu cho phuong thuc cha khi ma cha khoi tao con thi no se dung method cua lop con ma ko can
                Sach sach = (Sach)ds[i]; // day chinh la downcasting de lop cha co the goi toi doi tuong cua lop con
                if(sach.tenTL.equals(ten) && sach.tacGia.equals(tacGia)){
                    sach.hienThi();
                }
            }
        }
    }

    public void tim(String ten, String chuyenNganh, int so, int nam) {
        for (int i = 0; i < soTL; i++) {
            if (ds[i].loaiTL().equals("Tap chi")) {// upcasting
                TAPCHI s = (TAPCHI)ds[i]; // downcasting
                if (s.tenTL.equals(ten) && s.chuyenNganh.equals(chuyenNganh) && (s.so == so) && (s.nam == nam)) {
                    s.hienThi();
                }
            }
        }
    }

    public void tim(String ten, int stt, String noiDung) {
        for (int i = 0; i < soTL; i++) {
            if (ds[i].loaiTL().equals("CD")) {
                CD s = (CD)ds[i];
                if (s.tenTL.equals(ten) && s.noiDung.equals(noiDung) && (s.soTT == stt)) {
                    s.hienThi();
                }
            }
        }
    }
}