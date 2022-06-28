package QuanLyThuVien2;

import QuanLyThuVien.TAILIEU;

import java.util.ArrayList;

public class DSTL {
    public ArrayList<TaiLieu> list = new ArrayList<>();
    public DSTL(){

    }
    public void add(TaiLieu taiLieu){
//        if(check(taiLieu) == true ) list.add(taiLieu);
//        else System.out.println("Da co");


//        for (TaiLieu x:list) {
//            if(x.maTL.equals(taiLieu.maTL)){
//                System.out.println("Da co");
//                return;
//            }
//        }
//        list.add(taiLieu);

        boolean flag = true;
        for(TaiLieu x:list){
            if(x.maTL.equals(taiLieu.maTL)){
                System.out.println("Da co");
                flag = false;

            }
        }
        if(flag == true) list.add(taiLieu);
    }
    public boolean check(TaiLieu taiLieu){
        for(TaiLieu x:list){
           if(x.maTL.equals(taiLieu.maTL)){
              return false;
           }
        }
        return true;
    }
    public void remove(TaiLieu taiLieu){
        for (int i = 0; i < list.size(); i++) {
            if(taiLieu.tenTL.equals(list.get(i).tenTL)){
                list.remove(i);
            }
        }
    }
    public void lietKe(){
        for (TaiLieu x :list){
            x.hienThi();
        }
    }
    public void lietKe(String s){
        for (TaiLieu x :list){
            if(x.Loai().equals(s)){
                x.hienThi();
            }
        }
    }


    public String layTL(String maTL){ // cai nay cua thu vien cho muon
        for (TaiLieu x:list){
            if(x.maTL.equals(maTL)){
               return maTL;
            }
        }
        return null;
    }

    public void timSach(String ten , String tagGia){
        for (TaiLieu x:list) {
            if(x.Loai().equals("Sach")){
                Sach sach = (Sach)x;
                if(sach.tacGia.equals(tagGia) && sach.tenTL.equals(ten)){
                    sach.hienThi();
                }
            }

        }
    }
    public void timTapChi(String ten, String chuyenNganh, int so, int nam){
        for (TaiLieu x:list) {
            if(x.Loai().equals("Tap chi")){
                TapChi tapChi = (TapChi) x;
                if(tapChi.tenTL.equals(ten) && tapChi.chuyenNganh.equals(chuyenNganh) && tapChi.so == so && tapChi.nam == nam){
                    x.hienThi();
                }
            }

        }
    }
    public void timCD(int stt, String noiDung){
        for (TaiLieu taiLieu: list) {

            if(taiLieu.Loai().equalsIgnoreCase("cd")){
                CD cd = (CD) taiLieu; // down casting
                if(cd.stt == stt && cd.noiDung.equals(noiDung)){
                    taiLieu.hienThi();
                }
            }
        }
    }
}
