package Tuan8.Lession4.Excersise1;

public class Book {
    private String name;
    private String author;
    private int numberOfPage;
    private static int numOfBook = 0;
    private static int sumOfPage = 0;


    public Book(String name, String author, int numberOfPage) {
        this.name = name;
        this.author = author;
        this.numberOfPage = numberOfPage;
        numOfBook = numOfBook +1;
        sumOfPage += numberOfPage;
    }

    public static int getSumOfPage(){
        return sumOfPage;
    }
    public static int getNumOfBook() {
        return numOfBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    public void display(){
        System.out.println("Ten sach: "+this.name+", ten tac gia: "+this.author+", so trang: "+numberOfPage);
    }
}
