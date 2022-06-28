package JavaNangCao.HastableExamample;

import java.util.Enumeration;
import java.util.Hashtable;

public class Entry {
    public static void main(String[] args) {
        Hashtable<String , Student> table = new Hashtable<String,Student>();
        table.put("1",new Student("Vu Trong Nhan",20,"123"));
        table.put("2",new Student("Ha Duong Pig",20,"124"));
        Enumeration elemt = table.elements();
        Enumeration keys = table.keys();
        while(keys.hasMoreElements()){
            System.out.println(keys.nextElement() + " : " + elemt.nextElement());
        }
    }
}
