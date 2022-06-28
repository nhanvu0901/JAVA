import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolyLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang = sc.nextInt();
        int cot = sc.nextInt();
        int[][] a = new int[hang][cot];
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.println(a[i][j]+"");
            }
            System.out.println(" ");
        }
    }

}
