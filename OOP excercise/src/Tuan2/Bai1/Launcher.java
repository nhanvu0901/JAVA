package Tuan2.Bai1;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh hinh tron");
        Double banKinh = sc.nextDouble();
        Circle tron = new Circle(banKinh);
        System.out.println();
        System.out.println("Chu vi hinh tron la "+tron.getPerimeter());
        System.out.println("Dien tich hinh tron la "+tron.getArea());
        System.out.println();
        System.out.println("Nhap vao canh hinh vuong");
        Double canh = sc.nextDouble();
        Square vuong = new Square(canh);
        System.out.println();
        System.out.println("Chu vi hinh vuong la "+vuong.getPerimeter());
        System.out.println("Dien tich hinh vuong la "+vuong.getArea());
    }
}
