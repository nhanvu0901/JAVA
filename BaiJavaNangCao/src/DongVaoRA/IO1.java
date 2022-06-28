package DongVaoRA;

import java.io.*;
class IO1 { // chuong trinh doc file van ban va hien thi ra man hinh
    public static void main(String args[]) {
        try {
            FileInputStream fi = new FileInputStream("");
            int ch;
            while ((ch = fi.read()) != -1) System.out.print((char) ch);
            fi.close();
        } catch (IOException e1) {
            System.out.print("Co loi doc file");
        }
    }
}
