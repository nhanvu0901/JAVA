
import java.util.*;
import java.util.Enumeration;
public class HashtableExample
{
    public static void main(String args[]) {
        Hashtable tdav = new Hashtable();
        tdav.put("Hello", "Chao");
        tdav.put("Begin", "Bat dau");
        tdav.put("End", "Ket thuc");
        tdav.put("Start", "Khoi dau");
//Tim tu trong tu dien
        String tu = "start";
        if (tdav.containsKey(tu))
            System.out.println(tu + " : " + tdav.get(tu));
        else
            System.out.println("Khong co tu:" + tu);
        Enumeration elem = tdav.elements();
        Enumeration keys = tdav.keys();

        System.out.println("\nDanh sach");
        while (elem.hasMoreElements() ) { // can mot dieu kien ka du
            System.out.println(keys.nextElement() + " : " + elem.nextElement());
        }
    }}