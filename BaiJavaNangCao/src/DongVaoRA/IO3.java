package DongVaoRA;

import java.io.*;
class IO3{ //  Ví dụ: chương trình đọc file văn bản và in lên màn hình.
    public static void main(String args[])
    {
        try{
            FileInputStream f = new FileInputStream("IO3.java");
            DataInputStream fi = new DataInputStream(f);
            String s;
            while ((s=fi.readLine())!=null) System.out.print(s+"\n"); fi.close();
        }
        catch(IOException e1){System.out.print("Co loi doc file");}
}
}
