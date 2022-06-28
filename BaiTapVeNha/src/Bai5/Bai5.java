package Bai5;

import java.util.Scanner;

public class Bai5 {
    public static boolean show( int n){


        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {


        System.out.println("Cac so nguyen to co 5 chu so la");
        for (int i = 9999; i < 100000; i++) {
            if(show(i)){
                System.out.print(i+" ");
            }
        }
    }
}
