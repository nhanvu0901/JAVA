package DongVaoRA;
import java.io.*;
class IO2 { // chương trình tạo file IO2.txt chứa dòng chữ“ Minh hoa FileOutputStream

    public static void main(String args[]) {
        try {
            FileOutputStream fo = new FileOutputStream("IO2.txt");
            String s = "Minh hoa FileOutputStream";
            int i;
            for (i = 0; i < s.length(); i++) fo.write(s.charAt(i));
            fo.close();
        } catch (IOException e1) {
            System.out.print("Co loi ghi file");
        }
    }
}
