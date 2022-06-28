package CodeLearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Merge2Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] =sc.nextInt();
        }
        Queue<Integer> list = new LinkedList<>();
        int i=0,j=0;
        while(i < a.length && j <b.length){
            if (a[i] < b[j]){
                list.add(a[i]);
                i++;
            } else {
                list.add(b[j]);
                j++;
            }
        }
        while(i<a.length){
            list.add(a[i]);
            i++;
        }
        while(j<b.length){
            list.add(b[j]);
            j++;
        }
       for (Integer x :list){
           System.out.print(x+" ");
       }
    }

}
