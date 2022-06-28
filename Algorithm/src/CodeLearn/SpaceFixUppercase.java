package CodeLearn;

import java.util.Locale;

public class SpaceFixUppercase {
    public static String amendTheSentence(String s){
        String result ="";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                result = result + " " +(char)(s.charAt(i)+32);
            }
            else{
                result = result + s.charAt(i);
            }

        }
        return result.trim();
    }
     /* static String amendTheSentence(String s)
    {
        int l = s.length();
        StringBuilder bd = new StringBuilder();
        if (Character.isUpperCase(s.charAt(0)))
        {
            bd.append(Character.toLowerCase(s.charAt(0)));
        } else
        {
            bd.append(s.charAt(0));
        }
        for (int i = 1; i < l; i++)
        {
            if (Character.isUpperCase(s.charAt(i)))
            {
                bd.append(' ');
                bd.append(Character.toLowerCase(s.charAt(i)));
            } else
            {
                bd.append(s.charAt(i));
            }
        }
        String temp = bd.toString();
        return temp;
    } */

    public static void main(String[] args) {
        String s = "VuTrongNhan";
        System.out.println(amendTheSentence(s));

    }
}

