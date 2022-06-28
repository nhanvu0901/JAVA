package ThucHanhSo6.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class DSSV {
          protected Vector<SV> list ;
          public DSSV(int max){
          list =new Vector<SV>(max);
    }

    public void them(SV sv){
        boolean flag =true;
        for (SV sv1 :list) {
            if(sv1.layTen().equalsIgnoreCase(sv.layTen())){

                flag = false;
            }

        }
        if(flag == true) list.addElement(sv);
    }
    public SV lay(int i){
        if(!list.contains(list.get(i))){
            return null;
        }
        else return list.get(i);
    }

    public void lietKe(){
        for (SV sv :list) {
            sv.hienThi();
        }
    }
    public void sapHoTen(){
        Collections.sort(list);
    }

    public void sapTuoi(){
        if(list.isEmpty()) return ;

        int min ;

        for (int i = 0; i < list.size()-1; i++) {
            min = i;
//            for (int j = i; j < list.size(); j++) {
//                if(list.get(j).layNgaySinh().getYear() > list.get(min).layNgaySinh().getYear()) {
//                    min = j;
//                }
//                else if(list.get(j).layNgaySinh().getYear() == list.get(min).layNgaySinh().getYear()){
//                    if(list.get(j).layNgaySinh().getMonth() > list.get(min).layNgaySinh().getMonth()){
//                        min =j;
//                }
//                    else if(list.get(j).layNgaySinh().getMonth() == list.get(min).layNgaySinh().getMonth()){
//                        if(list.get(j).layNgaySinh().getDate() == list.get(min).layNgaySinh().getDate())
//                            min =j;
//                    }
//                }
//            } // co lay tuoi roi nen ko can lay tung nam thang ngay lam j
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(min).layTuoi() > list.get(j).layTuoi())
                    min =j;
            }
            if(min != i){
                SV temp = list.get(i);
                list.set(i,list.get(min));
                list.set(min,temp);
            }
        }
    }

    public void timTen(String name){
        for (SV sv:list) {
            if(sv.layTen().equalsIgnoreCase(name)){
                sv.hienThi();
            }
        }
    }
    public void xoa(SV sv){
        list.remove(sv);
    }


}

