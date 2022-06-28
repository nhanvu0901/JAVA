package CodeLearn;

public class formatString {
    public static String check(String s ) {
        String[] result = s.split(" ");//tach chuoi dua tren khoang trong trang
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<result.length; i++){
            if(result[i].equals("")){
                continue;
            }
            builder.append(result[i] + " ");
        }

        return builder.toString().trim();
    }
    public static void main(String[] args) {
        String s = " abc   a aa  a a";
        System.out.println(check(s));
    }
}

