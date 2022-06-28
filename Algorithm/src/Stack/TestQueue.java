package Stack;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TestQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            queue.add(n);
        }


        int k = sc.nextInt();
        int z =0;
        while(z <k){
            queue.add(queue.peek());
            queue.remove(queue.peek());
            z++;
        }
        System.out.println(queue);
    }

}
