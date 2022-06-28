package QuanLyThuVien2;

import QuanLyThuVien.TAILIEU;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class QuanLyThuVIen {
    ArrayList<SV> listSV = new ArrayList<>();
    DSTL dstl = new DSTL();
    Scanner sc = new Scanner(System.in);

    public QuanLyThuVIen(DSTL dstl){
        listSV = new ArrayList<SV>();
        this.dstl = dstl;

    }
    public  void choMuon(TaiLieu taiLieu, SV sv){
        String maTl = this.dstl.layTL(taiLieu.maTL);

        if(maTl != null && !sv.listTl.contains(taiLieu) ){
            sv.add(taiLieu);
           if(!listSV.contains(sv)){
               listSV.add(sv);
           }
        }
        else if(sv.listTl.contains(taiLieu))System.out.println("Tai lieu "+taiLieu.tenTL+" da muon boi "+sv.hoTen);
        if(maTl == null) System.out.println("Khong co tai lieu nay trong thu vien");

    }
    public void traTl(TaiLieu taiLieu,SV sv){
        if(sv.listTl.contains(taiLieu)){
            sv.remove(taiLieu);
        }
        else{
            System.out.println("Sinh vien khong muon tai lieu nay");
        }
    }
    public void ds_Tl_1_Sv_Muon(SV sv){
        System.out.println("Danh sach tai lieu sinh vien "+sv.layTen()+" muon");
        for (TaiLieu taiLieu :sv.listTl) {
            taiLieu.hienThi();
        }
    }
    public void dsSV(){
        System.out.println("Danh sach sinh vien muon tai lieu");
        for (int i = 0; i < listSV.size(); i++) {
            listSV.get(i).hienThi();
        }
    }
    public void ds_Tl_dangMuon(){

        System.out.println("Danh sach tai lieu dang muon");

        for (SV sv :listSV) {
            for (TaiLieu taiLieu:sv.listTl) {
                taiLieu.hienThi();
            }
        }
    }
    public void ds_Tl_dangMuo(){

        System.out.println("Danh sach tai lieu dang muon");



        for (SV sv :listSV) {

            for (TaiLieu x:sv.listTl){
                x.hienThi();
               }
            }
        }
    }

