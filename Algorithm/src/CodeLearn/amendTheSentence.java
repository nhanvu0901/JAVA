package CodeLearn;

public class amendTheSentence {
   public static String amendTheSetence(String s){
       String result ="";
       for (int i = 0; i < s.length(); i++) {
           if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
               result = result + " " +(char)(s.charAt(i)+32);

           }
           else{
               result += s.charAt(i);
           }

       }
       return result;
    }

    public static void main(String[] args) {
        String n ="CodelearnIsAwesome";
        System.out.println(amendTheSetence(n));;
    }
}
