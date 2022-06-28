package JavaNangCao.VectorExample;

import java.sql.SQLOutput;
import java.util.Enumeration;
import java.util.Vector;

public class DSSV {
    private Vector ds; // private SV[] ds;
    private int soSV;


    public DSSV( ) {
        ds = new Vector(); // ds = new SV[max]

    }

    public void them(SV sinhVien) {
        boolean flag = true;
        for (int i = 0; i < ds.size(); i++) {
            SV sv = (SV) ds.get(i);
            if (sv.layHoTen().equals(sinhVien.layHoTen())) {
                flag = false;
            }
        }
        if (flag == true) {
            ds.add(sinhVien);
        }
    }
    public void tim(String tenHocSinh){
        for (int i = 0; i < ds.size(); i++) {
            SV sv = (SV) ds.elementAt(i);
            if(sv.layHoTen().equals(tenHocSinh)){
                sv.hienThi();
            }
            else System.out.println("Khong co ten sinh vien "+ tenHocSinh+" nay trong danh sach");
            break;
        }
    }
    public void lietKe(){
        Enumeration e = ds.elements();
        while(e.hasMoreElements()){     // ep kieu vi moi phuong thuc cua Vector deu ve kieu Ob
            SV sv = (SV)e.nextElement();// phai ep kieu vi vi moi lan chúng ta lấy ra một phần tử sinh viên là nó hiểu là lớp OBJECT lớp SV là lớp con của lớp OBJECT  nên phải ép kiểu nếu muốn dùng
            sv.hienThi();
        }
    }
    public void them(SV sinhvien,int vitri){
           ds.add(vitri,sinhvien);
    }
    public void xoa (SV sinhVien){
        ds.remove(sinhVien);
    }
    public void xoa (int vitri){
        ds.remove(vitri);
    }
    public void xoaAll(){
        ds.removeAllElements();
    }
    public void edit(SV sinhvien,int vitri){

        ds.setElementAt( sinhvien,vitri);
    }


}