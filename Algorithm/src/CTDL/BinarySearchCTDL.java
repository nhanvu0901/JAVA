package CTDL;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinarySearchCTDL {
    public static int binarySearch(int array[], int x, int low, int high) {


        if (high >= low) {
            int mid = low + (high-low) / 2; // chỉ số bắt đầu từ 0 làm thế này để cộng vs low để tìm index ở bước cuối cùng cho chính xác vd hai số sát nhau

            if (array[mid] == x) return mid;//if found ar mid then return mid


            if (array[mid] > x) return binarySearch(array, x, low, mid - 1);


            else  return binarySearch(array, x, mid + 1, high);
        }
        /* else */
        return -1; // nếu phần tử không có trong m thì trả về -1
    }
    public static   void printArray(int[]a, int low , int high){
        for (int i = low; i <= high; i++) {
            System.out.println(a[i]);
        }
    }
    static boolean solve(int[]a,int sum,int n){
        int[] b = new int[n];
        b[0] = a[0];
        for (int i = 1; i < n; i++){
            b[i] = b[i-1] + a[i];
        }
        for (int i = 0; i < n ;i++) {
            if(b[i] < sum){
               continue;
            }
            else if(b[i] >sum){
                int low = binarySearch(b,b[i]-sum,0,n-1);
                if (low != -1){
                    printArray(a,low+1,i);
                    return true;
                }
            }
            else printArray(a,0,i);
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int m =sc.nextInt();
       boolean k = solve(a,m,n);
       if(k == false){
           System.out.println("-1");
       }
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Queue<Integer> queue = new LinkedList<>();
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int s = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            if(sum < s){
//                sum += a[i];
//                queue.add(a[i]);
//            }
//            else if(sum >s){
//                queue.poll();
//                i=i-1;
//            }
//            else break;
//        }
//        if(sum == s){
//            while (!queue.isEmpty())
//                System.out.print(queue.poll() + " ");
//        }
//        else
//            System.out.println("-1");
//    }