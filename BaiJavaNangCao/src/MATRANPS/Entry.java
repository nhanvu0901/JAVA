package MATRANPS;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Entry {

    public static void main (String[]args) {
//        MATRAN m1 = new MATRAN(3,5);
        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                int m = sc.nextInt();
//                m1.GanGiatri(i,j,m);
//            }
//        }
//        m1.hienThi();
//        System.out.println();

        MATRAN m2 = new MATRAN(3,3);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                PS ps =  new PS(m,n);
                m2.ganGiaTRiPS(i,j,ps);
            }
        }
        m2.hienThiPS();
        System.out.println();

        MATRAN m3 = new MATRAN(3,3);
        PS phanso2 = new PS(2,3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int m = sc.nextInt();
                int n = sc.nextInt();
                PS ps =  new PS(m,n);

                m3.ganGiaTRiPS(i,j,ps);
            }
        }
        m3.hienThiPS();
        System.out.println();

        (m3.congPS(m2)).hienThiPS();



    }
}





