package Bai3;

import java.util.Scanner;

public class Bai3 {
   public static int UCLN(int a ,int b){
       while(a != b){
           if (a > b ){
               a = a - b;
           }
           else b = b - a;
       }
       return a;
   }
   public static int BCLN(int a ,int b){
       int c = UCLN(a,b);
       return ((a*b)/c);
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat");
        int a = sc.nextInt();
        System.out.println("Nhap so thu hai");
        int b = sc.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la");
        System.out.println(UCLN(a,b));
        System.out.println("Boi chung lon nhat cua "+a+" va "+b+" la");
        System.out.println(BCLN(a,b));

    }
}
