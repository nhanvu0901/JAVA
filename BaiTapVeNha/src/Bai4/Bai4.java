package Bai4;

import java.util.Scanner;

public class Bai4 {
    public static boolean show( int n){
        if (n < 2) {
            return false;
        }

        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Cac so nguyen to nho hon "+b+" la");
        for (int i = 0; i < b; i++) {
            if(show(i)){
                System.out.print(i+" ");
            }
        }
    }
}
