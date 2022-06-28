package CodeLearn;

import java.util.Scanner;

public class factorSum {
    static int solve(int n){
        int k = 2, sum = 0;
        while (n > 1){
            while (n % k == 0){
                sum += k;
                n /= k;
            }
            k++;
        }
        return sum;
    }
    static int  factorSum(int n){

        n = solve(n);
        return n;
    }

    public static void main(String[] args) {
        int n = factorSum(35);
        System.out.println(n);
    }
}

