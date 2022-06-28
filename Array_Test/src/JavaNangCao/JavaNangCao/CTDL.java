package JavaNangCao.JavaNangCao;

import java.awt.desktop.SystemEventListener;
import java.util.*;


import java.util.Map;
import java.util.TreeMap;
public class CTDL {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();

        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        StringTokenizer st1 = new StringTokenizer(str, " -,.;");

        while(st1.hasMoreTokens()){
            Object object = st1.nextToken();
            if (!map.containsKey(object)){
                map.put((String) object,1);
            }
            else{
                int n = map.get(object);
                map.put((String) object,++n);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(map);
        Set<Map.Entry<String, Integer>> mappings = sorted.entrySet();

        Enumeration keys = map.keys();
        Enumeration values = map.elements();

       while(keys.hasMoreElements()){
           System.out.println(keys+":"+values);
       }
    }
    }
