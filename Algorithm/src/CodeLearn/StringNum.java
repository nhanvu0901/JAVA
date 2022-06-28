package CodeLearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StringNum {


    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        string += " ";//cái này là dùng để duyệt với phần tử cuối của dãy
        //dòn code này là thêm một khoảng trông string vào để ss với kí tự cuối
        int x = 1;
        for (int i = 1; i < string.length() ; i++ ) {
            if (string.charAt(i) == string.charAt(i -1) ) {
                x++;

            }else {
                result += (string.charAt(i-1)) ;
                result += x;
                x = 1;
            }
        }
        System.out.print(result);
    }
}
