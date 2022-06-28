package JavaNangCao.VectorExample;



import java.util.Enumeration;
import java.util.Vector;

public class Entry {
    public static void main(String[] a) {
        DSSV dssv = new DSSV();
        SV sv0 = new SV("Vu Trong Nhan");
        SV sv1 = new SV("Vu Trong Nhan");
        SV sv2 = new SV("Ha Duong Pig");
        SV sv3 = new SV("Luong The Vinh");
        SV sv4 = new SV("NGuyen VAn A");
        dssv.them(sv0);
        dssv.them(sv1);
        dssv.them(sv2);
        dssv.them(sv3);
        dssv.them(sv4);
        dssv.lietKe();
        System.out.println("----------------------------------------------");
        dssv.tim("Vu Trong Nhan");
    }


    final class outer{

    }
}
