package Tuan1;

import java.util.Scanner;

public class Excercise2 {
    public static void EasySort(int[]arr,int n){
        for (int i = 0; i < n; i++) {
            int min =i;
            for (int j = i; j <n ; j++) {
                if(arr[min] >arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        EasySort(arr,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
