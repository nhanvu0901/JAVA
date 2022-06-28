package BaiThucHanhDSSV;

import java.util.ArrayList;
import java.util.Locale;

public class DSSV1 {
    ArrayList<SV> list = new ArrayList<>();


    public DSSV1(int max){
        list = new ArrayList<SV>(max);
    }
    public void them(SV sv){
        list.add(sv);
    }
    public void lietKE(){
        for (SV sv :list) {
            sv.hienThi();
        }
    }
    public void lietKE(String s){
        System.out.println("Danh sach hoc sinh "+ s.toUpperCase());
        for (SV sv:list) {
            if(sv.loaiSV(s)){
              sv.hienThi();
            }

        }
    }

    public void dsTN(){
        System.out.println("Danh sach hoc sinh duoc thi nghiem");
        for (SV sv:list) {
            if(sv.duocTN()){
                sv.hienThi();
            }
        }
    }
}
