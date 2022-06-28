package Test;

import java.util.Date;

public class Entry {
    public static void main(String[] args) {
        DSSV list = new DSSV(5);
        SV sv1 = new SV("Vu Trong Nhan",new Date(2001,1,9),10);
        SV sv2 = new SV("NGhiem Phuong Linh",new Date(2003,7,28),10);
        SV sv3 = new SV("Ha Duong PHI",new Date(2002,1,19),10);
        SV sv4 = new SV("Ha Duong A",new Date(2005,1,19),10);
        list.them(sv1);
        list.them(sv2);
        list.them(sv3);
        list.them(sv4);
        list.sapHoTen();
        list.lietKe();
        System.out.println();
        list.xoa(sv3);
        list.lietKe();
    }
}
