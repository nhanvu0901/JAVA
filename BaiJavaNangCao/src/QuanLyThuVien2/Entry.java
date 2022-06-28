package QuanLyThuVien2;

import QuanLyThuVien.TAILIEU;

import java.util.ArrayList;
import java.util.Date;

public class Entry {

    public static void main(String[] args) {
        DSTL list = new DSTL();

        TaiLieu sach1 = new Sach("20123","Chi Pheo","123","Vu Trong Phung","Kim Dong",1998);
        TaiLieu sach3 = new Sach("20123","Chi Pheo","123","Vu Trong Phung","Kim Dong",1998);
        TaiLieu sach2 = new Sach("201234","Kieu","1231","Nguyen Du","Kim Dong",1600);
        TaiLieu tapChi1 = new TapChi("123123","Play Boy","12312","Giai tri",100,2021);
        TaiLieu tapChi2 = new TapChi("111111","Xe hoi","00000","Giai tri",100,2021);
        TaiLieu cd1 = new CD("2012388","Porn","12312",2,"Giai tri");
        list.add(sach1);
        list.add(sach2);
        list.add(tapChi1);
        list.add(tapChi2);
        list.add(sach3);
        list.add(cd1);
//        list.lietKe();
        System.out.println();


        SV sv1 = new SV("Vu Trong Nhan",20198252);
        SV sv2 = new SV("Nghiem Phuong Linh",20190000);
        SV sv3 = new SV("Ha Duong Phi",20190000);

        QuanLyThuVIen thuVien = new QuanLyThuVIen(list);
        thuVien.choMuon(sach1,sv1);
        thuVien.choMuon(sach2,sv1);
        thuVien.choMuon(tapChi1,sv1);
        thuVien.traTl(sach2,sv1);

        thuVien.choMuon(tapChi1,sv2);
        thuVien.choMuon(tapChi2,sv2);

        thuVien.ds_Tl_1_Sv_Muon(sv1);
        System.out.println();
        thuVien.ds_Tl_1_Sv_Muon(sv2);
        thuVien.dsSV();
        System.out.println();
        thuVien.ds_Tl_dangMuon();


    }
}
