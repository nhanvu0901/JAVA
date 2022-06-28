package Tuan8.Lession4.Excersise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao so sach muon nhap");
        int numOfBook = in.nextInt();
        Book[] arrayBook = new Book[numOfBook];
        System.out.println("Nhap thong tin cua "+numOfBook+" quyen sach");
        for (int i = 0; i < numOfBook; i++) {
            System.out.println("Xin nhap ten sach");
            String name = checkInputString();
            System.out.println("Xin nhap tac gia cua sach");
            String author = checkInputString();
            System.out.println("Nhap so trang cua sach");
            int sotrang = in.nextInt();
            Book book = new Book(name,author,sotrang);
            arrayBook[i] = book;
        }
        for (int i = 0; i < numOfBook; i++) {
            arrayBook[i].display();
        }
        System.out.println("So sach hien co");
        System.out.println(Book.getNumOfBook());



        System.out.println(Book.getSumOfPage());
    }



    public static String checkInputString() {

        Scanner in = new Scanner(System.in);
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Ko de trong");
                System.out.print("Xin nhap lai: ");
            } else {
                return result;
            }
        }
    }
}
