package DeQuy;

import java.util.Scanner;

public class SumOfOddNumberInArray {
    public static int inTongChuSoLe(int n){
        int b =0;
        if(n <0) return n*-1;
        if(n ==0) return 0;
        else {
            b = n/10;
            if(n % 2 != 0){
                return n % 10 + inTongChuSoLe(b);
            }
            else return inTongChuSoLe(b);
        }
    }
public static int inTongChuSoLeKoDeQuy(int n){
    int b ;
    if(n <0) return n*-1;
    int sum =0;
    while(n !=0 ){
        b = n/10;
        if(n % 2 !=0){
            sum += n%10;
        }
        n=b;
    }
    return sum;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(inTongChuSoLeKoDeQuy(n));
    }
}
