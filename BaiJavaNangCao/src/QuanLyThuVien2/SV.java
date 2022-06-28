package QuanLyThuVien2;

import java.util.ArrayList;
import java.util.Date;
//Tạo một cái bảng băm để lưu dữ liệu
// Tạo một lớp Nhat ky thu vien chua bang bam / danh sach hoc sinh tu tao / danh sach tai lieu tu tao
public class SV {
    protected String hoTen;
    protected int mssv;
    protected ArrayList<TaiLieu> listTl = new ArrayList<>();



    public void add(TaiLieu taiLieu){
        listTl.add(taiLieu);
    }

    public ArrayList<TaiLieu> getListTl() {
        return listTl;
    }

    public void remove(TaiLieu taiLieu){
        for (int i = 0; i < listTl.size(); i++) {
            if(taiLieu.tenTL.equals(listTl.get(i).tenTL)){
                listTl.remove(taiLieu);
            }
        }
    }


    public void lietKe(String s){
        for (TaiLieu x :listTl){
            if(x.Loai().equals(s)){
                x.hienThi();
            }
        }
    }
    public void codeTL(String maTL){
        for (TaiLieu x:listTl){
            if(x.maTL.equals(maTL)){
                x.hienThi();
            }
        }
    }
    public void timSach(String ten , String tagGia){
        for (TaiLieu x:listTl) {
            if(x.Loai().equals("Sach")){
                Sach sach = (Sach)x;
                if(sach.tacGia.equals(tagGia) && sach.tenTL.equals(ten)){
                    x.hienThi();
                }
            }

        }
    }





    public SV(String hoTen, int mssv) {
        this.hoTen = hoTen;
        listTl = new ArrayList<TaiLieu>();
        this.mssv = mssv;
    }


    public String layHoTen() {
        return hoTen;
    }
    public String layTen(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.lastIndexOf(" ");
        String kq = this.hoTen.substring(n+1);
        return kq;
    }
    public String layHo(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.indexOf(" ");
        String kq = this.hoTen.substring(0,n);
        return kq;
    }
    public String layDem(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.indexOf(' ');
        int m = this.hoTen.lastIndexOf(' ');
        String kq = this.hoTen.substring(n,m);
        return kq;
    }
    public void hienThi(){
        System.out.println("Ten sinh vien la "+this.layHoTen());

    }
    public boolean duocTN() { return true;}
}
