package Tuan1;

import java.util.Random;
import java.util.Scanner;

public class Excercise1 {
    public static void  Swap(int[]arr,int a,int b){
       int temp= arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int n = sc.nextInt();
        int arr[] = new int[n];
        int vitri1 = random.nextInt(n);
        int vitri2 = random.nextInt(n);
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1000);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Da doi cho o vi tri "+(vitri1+1)+" va vi tri "+(vitri2+1));

        Swap(arr,vitri1,vitri2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
