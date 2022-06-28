import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s ="VuTrongNhan";
        Map<Character, Integer> d = new HashMap<Character, Integer>();
        String m = s.toLowerCase();

        for(int i = 0; i < s.length(); i++)
        {

            if(d.containsKey(s.charAt(i)))
            {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            }
            else
            {
                d.put(s.charAt(i), 1);
            }
        }

        int max =d.get(s.charAt(0));
        int index = s.charAt(0);
        for (int i = 0; i < d.size(); i++) {
                if (d.get(s.charAt(i)) > max) {
                    max = d.get(s.charAt(i));
                    index = i;
                }
        }
        System.out.println("Max:"+s.charAt(index)+":" +max);
        System.out.println();
        for (int i = 0; i < d.size(); i++) {
            if(d.get(s.charAt(i)) != 0) {
                System.out.print(s.charAt(i) );
                System.out.print(d.get(s.charAt(i))+" ");
                d.put(s.charAt(i),0);
            }
        }
    }
}
