package ThucHanhSo6.Bai1;

import java.util.Date;

public class Entry {
    public static void main(String[] args) {

        SV sv1 = new SV("B",new Date(2001,1,9),10);


        SV sv2 = new SV("A",new Date(2001,7,28),10);
        SV sv4 = new SV("C",new Date(2002,7,28),10);
        DSSV dssv = new DSSV(5);

        dssv.them(sv1);
        dssv.them(sv2);
        dssv.them(sv4);



        dssv.sapHoTen();
        dssv.lietKe();
    }
}
