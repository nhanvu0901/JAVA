package ThucHanhSo6.Bai3;

import ThucHanhSo6.Bai1.SV;

import java.util.ArrayList;
import java.util.Comparator;

public class Entry {


    public static ArrayList<So> listnum = new ArrayList<>();
    public static void addNum(So so){
       listnum.add(so);
    }

    public static void Sort(){
        listnum.sort(new Comparator<So>() {
            @Override
            public int compare(So o1, So o2) {
                if(o1.giaTri() > o2.giaTri()) return 1;
                else if (o1.giaTri() < o2.giaTri()) return -1;
                else return 0;
            }
        });
//        if(listnum.isEmpty()) return ;
//
//        int min ;
//
//        for (int i = 0; i < listnum.size()-1; i++) {
//            min = i;
//
//            for (int j = i+1; j < listnum.size(); j++) {
//                if(listnum.get(min).giaTri() < listnum.get(j).giaTri())
//                    min =j;
//            }
//            if(min != i){
//                So temp = listnum.get(i);
//                listnum.set(i,listnum.get(min));
//                listnum.set(min,temp);
//            }
//        }
    }
    public static void tinhTong(){
        double tong = 0;
        for (So x :listnum){
            tong += x.giaTri();
        }
        System.out.println(tong+" ");
    }

    public static void main(String[] args) {
        So soNguyen1 = new SoNuyen(99);
        So ps1 = new PS(2,3);

        So ps2 = new PS(3,4);
        So ps3 = new PS(3);
        So ps4 = new PS(5);
        So ps5 = new PS(3,5);
        So ps6 = new PS(3,8);
        So so = new SoNuyen(1);
        addNum(soNguyen1);
        addNum(ps1);
        addNum(ps2);
        addNum(ps3);
        addNum(ps4);
        addNum(ps5);
        addNum(ps6);
        addNum(so);

        Sort();
        for (So x :listnum){
            System.out.println(x.giaTri()+ " ");
        }
        tinhTong();
    }
}
