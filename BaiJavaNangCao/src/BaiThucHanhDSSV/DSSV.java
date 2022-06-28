package BaiThucHanhDSSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class DSSV {
    private SV ds[];
    private int soSV;

    public DSSV(int max){
        ds = new SV[max];
        soSV=0;
    }

    public void them(SV s){
        if(s!=null)
            if(soSV<ds.length)
                ds[soSV++]=s;
    }

    public SV laySV(int i){
        if((i<=0)||(i>soSV))
            return null;
        else
            return ds[i];
    }

    public void sapHoTen(){
        if(soSV==0)
            return;

        int min,tg;
        SV tmp;
        for (int i = 0; i < soSV-1; i++) {
            min=i;
            for (int j = i+1; j < soSV; j++) {
                tg=ds[min].layTen().trim().toLowerCase().compareTo(ds[j].layTen().trim().toLowerCase());

                if(tg>0)
                    min=j;
                else if(tg==0){
                    tg=ds[min].layDem().trim().toLowerCase().compareTo(ds[j].layDem().trim().toLowerCase());
                    if(tg>0)
                        min=j;
                    else if(tg==0){
                        tg=ds[min].layHo().trim().toLowerCase().compareTo(ds[j].layHo().trim().toLowerCase());
                        if(tg>0)
                            min=j;
                    }
                }
            }
            //swap
            if(min!=i){
                tmp=ds[i];
                ds[i]=ds[min];
                ds[min]=tmp;
            }
        }
    }

    public void sapTuoi(){
        if(soSV==0)
            return;

        int min;
        SV tmp;
        for (int i = 0; i < soSV-1; i++) {
            min=i;
            for (int j = i+1; j < soSV; j++) {
                if(ds[min].layNgaySinh().getYear()>ds[j].layNgaySinh().getYear()) {
                    min = j;

                }
                else if(ds[min].layNgaySinh().getYear()==ds[j].layNgaySinh().getYear()){
                    if(ds[min].layNgaySinh().getMonth()>ds[j].layNgaySinh().getMonth())
                        min=j;

                    else if(ds[min].layNgaySinh().getMonth()==ds[j].layNgaySinh().getMonth()){
                        if(ds[min].layNgaySinh().getDate()>ds[j].layNgaySinh().getDate())
                            min=j;

                    }
                }
            }
            //swap
            if(min!=i){
                tmp=ds[i];
                ds[i]=ds[min];
                ds[min]=tmp;
            }
        }
    }

    public void sapDTB(){
        if(soSV==0)
            return;

        int min;
        SV tmp;
        for (int i = 0; i < soSV-1; i++) {
            min=i;
            for (int j = i+1; j < soSV; j++) {
                if(ds[min].layDTB()>ds[j].layDTB())
                    min=j;

            }
            //swap
            if(min!=i){
                tmp=ds[i];
                ds[i]=ds[min];
                ds[min]=tmp;
            }
        }
    }

    public void timTen(String s){
        if((s==null)||(soSV==0))
            return;
        for (int i = 0; i < soSV; i++) {
            if(ds[i].layHoten().trim().equalsIgnoreCase(s))
                ds[i].hienThi();
        }
    }

    public void lietKeXepLoai(String s){
        if((s==null)||(soSV==0))
            return;
        for (int i = 0; i < soSV; i++) {
            if(ds[i].layXepLoai().equals(s)){
                ds[i].hienThi();
            }
        }
    }

    public void xoa(String s){
        if((s==null)||(soSV==0))
            return;
        int tg=-1;
        for (int i = 0; i < soSV; i++) {
            if(ds[i].layHoten().trim().equalsIgnoreCase(s))
            {
                tg=i;
                break;
            }
        }

        if(tg!=-1){
            for (int i = tg; i < soSV; i++) {
                ds[i] = ds[i+1];
            }
            soSV--;
        }
    }

    public void hienThi(){
        for (int i = 0; i < soSV; i++) {
            ds[i].hienThi();
        }
    }
}








//    protected ArrayList<SV> list ;
//    public DSSV(int max){
//        list = new ArrayList<SV>(max);
//    }
//
//    public void them(SV sv){
//        boolean flag =true;
//        for (SV sv1 :list) {
//            if(sv1.layTen().equalsIgnoreCase(sv.layTen())){
//
//                flag = false;
//            }
//
//        }
//        if(flag == true) list.add(sv);
//    }
//    public SV lay(int i){
//        if(!list.contains(list.get(i))){
//            return null;
//        }
//        else return list.get(i);
//    }
//
//    public void lietKe(){
//        for (SV sv :list) {
//            sv.hienThi();
//        }
//    }
//    public void sapHoTen(){
//        Collections.sort(list);
//    }
//    public void sapTuoi(){
//        if(list.isEmpty()) return ;
//
//        int min ;
//
//        for (int i = 0; i < list.size()-1; i++) {
//            min = i;
////            for (int j = i; j < list.size(); j++) {
////                if(list.get(j).layNgaySinh().getYear() > list.get(min).layNgaySinh().getYear()) {
////                    min = j;
////                }
////                else if(list.get(j).layNgaySinh().getYear() == list.get(min).layNgaySinh().getYear()){
////                    if(list.get(j).layNgaySinh().getMonth() > list.get(min).layNgaySinh().getMonth()){
////                        min =j;
////                }
////                    else if(list.get(j).layNgaySinh().getMonth() == list.get(min).layNgaySinh().getMonth()){
////                        if(list.get(j).layNgaySinh().getDate() == list.get(min).layNgaySinh().getDate())
////                            min =j;
////                    }
////                }
////            } // co lay tuoi roi nen ko can lay tung nam thang ngay lam j
//            for (int j = i+1; j < list.size(); j++) {
//                if(list.get(min).layTuoi() > list.get(j).layTuoi())
//                    min =j;
//            }
//            if(min != i){
//                SV temp = list.get(i);
//                list.set(i,list.get(min));
//                list.set(min,temp);
//            }
//        }
//    }
//
//    public void timTen(String name){
//        for (SV sv:list) {
//            if(sv.layTen().equalsIgnoreCase(name)){
//                sv.hienThi();
//            }
//        }
//    }
//    public void xoa(SV sv){
//        list.remove(sv);
//    }
