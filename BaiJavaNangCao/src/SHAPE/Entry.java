package SHAPE;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Nhap lua chon cua ban");
            System.out.println("1.Tinh dien tich hinh tron");
            System.out.println("2.Tinh dien tich hinh chu nhat");
            System.out.println("3.Tinh dien tich hinh tam giac");
            System.out.println();
            int number = sc.nextInt();
            switch (number){
                case 1:
                    System.out.println("Nhap ban kinh cho hinh tron ");
                    double bk = sc.nextDouble();
                    HINH tron = new HinhTron(bk);
                    tron.DienTich();
                    tron.hienThiS();
                case 2:
                    System.out.println("Nhap hai canh cua hinh chu nhat ");
                    double dai = sc.nextDouble();
                    double rong = sc.nextDouble();
                    HINH Cn = new HinhCn(dai,rong);
                    Cn.DienTich();
                    Cn.hienThiS();
                case 3:
                    System.out.println("Nhap ba canh cua tam giac ");
                    double c1 = sc.nextDouble();
                    double c2 = sc.nextDouble();
                    double c3 = sc.nextDouble();
                    HINH tamGiac = new TamGiac(c1,c2,c3);
                    tamGiac.DienTich();
                    tamGiac.hienThiS();
            }


        }
    }
}
