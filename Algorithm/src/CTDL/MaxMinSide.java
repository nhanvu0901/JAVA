package CTDL;

import java.util.Scanner;
// ham chia mot day so thanh hai neu chênh lệch của chúng min
public class MaxMinSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sumLeft =0  ;
        int sumRight = 0;
        int min = a[0] + a[1];
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            sumRight += a[i];
        }
        for (int i = 0; i < a.length; i++) {
              sumLeft += a[i];

            int hieu = Math.abs(sumRight -sumLeft);

            if(min > hieu){
                min = hieu;
                index =i;
            }
            if(i != a.length-1){
                sumRight = sumRight- a[i+1];
            }


        }
        for (int i = 0; i <= index; i++) {
            System.out.print(a[i]);
        }
        System.out.println("");
        for (int i = index+1; i < a.length; i++) {
            System.out.print(a[i]);
        }

    }
}
