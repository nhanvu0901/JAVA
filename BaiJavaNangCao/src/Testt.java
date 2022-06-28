import java.util.Hashtable;

public class Testt {
    public static void Print(int m){
        if(m > 0){
            System.out.println(m);
            Print(m-5);

        }
        System.out.println(m);
    }
    public static void main(String[] args)
    {
        Print(10);
    }
}