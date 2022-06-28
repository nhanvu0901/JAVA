package CTDL;

import java.util.ArrayList;
import java.util.Stack;

public class countTheWordString {
    public static void main(String[] args) {
        String s = "aaabbaaac";
        Stack<Character> stack = new Stack<>();
        String str ="";

        for (int i = 0; i < s.length(); i++) {
            if(stack.empty() || stack.peek() == s.charAt(i)){
                stack.push(s.charAt(i));
            }
            else{
                int count =1;
                str =str +stack.peek();
                while(!stack.empty()){
                    count++;
                    stack.pop();
                }
                str = str + count;
                stack.push(s.charAt(i));
            }
        }
        System.out.println(str);
    }

}
