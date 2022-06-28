package Bai1;

import java.util.Scanner;
public class Bai1{
    public static void  Bai1(int a ,int b,int c ) {

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot  nghiem : " + "x = " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        double answear1 = 0 ;
        double answear2 = 0 ;


        if (delta > 0) {
            answear1 =  ((-b + Math.sqrt(delta)) / (2*a));
            answear2 = ((-b - Math.sqrt(delta)) / (2*a));
        }
        else {
            if (delta == 0) {
                answear1 = answear2 = ((-b )/ 2*a);
            } else System.out.println("Phuong trinh vo nghiem");
            return;
        }
        System.out.println("x1 = "+answear1+" x2 = "+answear2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap hang so b: ");
        int b = sc.nextInt();
        System.out.println("Nhap hang so c: ");
        int c = sc.nextInt();
        Bai1(a,b,c);
    }
}