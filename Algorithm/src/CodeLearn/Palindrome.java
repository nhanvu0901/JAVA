package CodeLearn;

import java.util.Stack;

public class Palindrome {
    public static boolean checkThePalindrome(String s){
        for (int i = 0; i < (int)s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return  true;
    }
    public static boolean  checkBlBl(int num){
        return (num<10 && num>5);
    }
    public static void main(String[] args) {
        /*String n ="aaaaabaaaaa";
        System.out.println(checkThePalindrome(n));
        */
        int a =11;
        if(checkBlBl(a)) System.out.println("Duoc");
        else System.out.println("ko");
    }
}
