package Tuan1;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        System.out.println("Nhap chieu cao tu 2 den 10");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        while(height <=2 || height >=10){
            System.out.println("Xin nhap so tu 2 den 10");
            height = sc.nextInt();
        }
        int width = (2*height)-1;
        int count =0;
        int middle = height-1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(j >= middle-count && j<= middle +count){
                    System.out.print("* ");
                }
                else{
                    System.out.print("- ");
                }
            }
            count++;
            System.out.println("");
        }
    }
}
