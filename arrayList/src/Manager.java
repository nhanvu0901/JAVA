import java.util.ArrayList;


public class Manager {
    private ArrayList<Student> student;

    public Manager() {
        student = new ArrayList<Student>();
    }

    public void addStudent(Student student){
        this.student.add(student);
    }

    public void removeStudent(Student student){
        this.student.remove(student);
    }

    public void showListInforStudent() {
        this.student.forEach(o -> System.out.println(o.toString()));
    }

}
