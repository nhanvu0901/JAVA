import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("Student manager system: ");
            System.out.println("Enter 1 to insert student info");
            System.out.println("Enter 2 to delete student info");
            System.out.println("Enter 3 to To show information student");
            int n = sc.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Enter student name" );
                    String name = sc.next();
                    System.out.println("Enter student address");
                    String address = sc.next();
                    System.out.println("Enter student id");
                    int id = sc.nextInt();
                    Student student = new Student(name,address,id);
                    manager.addStudent(student);
                    System.out.println(student.toString()+" ");
                    break;
                }
                case 2: {
                    System.out.println("Enter student name" );
                    String name = sc.next();
                    System.out.println("Enter student address");
                    String address = sc.next();
                    System.out.println("Enter student id");
                    int id = sc.nextInt();
                    Student student = new Student(name,address,id);
                    manager.removeStudent(student);
                    System.out.println(student);
                    break;
                }
                case 3: {
                    manager.showListInforStudent();
                    break;
                }
                default:
                    System.out.println("Invalid");


            }

        }
    }
}