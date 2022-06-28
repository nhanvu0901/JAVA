package BaiThucHanhDSSV;

import java.util.Date;

public class Entry1 {
    public static void main(String[] args) {
        SV sv1 = new SVSP("Vu Trong Nhan",new Date(1970,9,1),8.0,"NK",9.0);
        SV sv2 = new SVSP("HA",new Date(2001,9,1),8.0,"NK",9.0);
        SV sv3 = new SVSP("Ba",new Date(2001,9,1),2.0,"NK",1.0);
        SV sv4 = new SVSP("CA",new Date(2001,9,1),8.0,"NK",9.0);
        SV sv5 = new SVTH("Da",new Date(2001,9,1),9.0,"NK",6.0);
        SV sv6 = new SVTH("Vu Trong Nghia",new Date(2001,9,1),4.0,"NK",3.0);
        DSSV1 list = new DSSV1(7);
        list.them(sv1);
        list.them(sv2);
        list.them(sv3);
        list.them(sv4);
        list.them(sv5);
        list.them(sv6);

        list.lietKE("sp");
        list.dsTN();
    }
}
