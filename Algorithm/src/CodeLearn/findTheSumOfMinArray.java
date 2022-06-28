package CodeLearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class findTheSumOfMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(sum < s){
                sum += a[i];
                queue.add(a[i]);
            }
            else if(sum >s){
                queue.poll();
                i=i-1;
            }
            else break;
        }
        if(sum == s){
            while (!queue.isEmpty())
                System.out.print(queue.poll() + " ");
        }
        else
            System.out.println("-1");
    }
}
