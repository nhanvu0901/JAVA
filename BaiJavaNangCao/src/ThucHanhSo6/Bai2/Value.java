package ThucHanhSo6.Bai2;

import java.util.ArrayList;

public class Value {
   protected String loaiTu;
   protected String NghiaTu;


    public Value(String loaiTu, String nghiaTu) {
        this.loaiTu = loaiTu;
        this.NghiaTu = nghiaTu;

    }

    public String getLoaiTu() {
        return loaiTu;
    }

    public void setLoaiTu(String loaiTu) {
        this.loaiTu = loaiTu;
    }

    public String getNghiaTu() {
        return NghiaTu;
    }

    public void setNghiaTu(String nghiaTu) {
        NghiaTu = nghiaTu;
    }
    public void hienThi(){
        System.out.println("Nghia la "+this.getNghiaTu()+" loai tu "+this.loaiTu);
    }
}
