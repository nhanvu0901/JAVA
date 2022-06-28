package CodeLearn;

public class Password {
    public boolean checkStrongPassword(String password) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        String s = "!@#$%^&*()-+";
        for (int i = 0; i < password.length(); i++) {
            if(password.length() >=6 ){
                flag1 = true;
            }
            if(password.charAt(i) == 65 && password.charAt(i) <= 90){
                flag2 = true;
            }
            if (password.charAt(i) >= 97 && password.charAt(i) <= 122){
                flag3 = true;
            }
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57){
                flag4 = true;
            }
            for (int j = 0; j < s.length(); j++) {      // hoac xem bang ma ascii de lay ki tu
                if (password.charAt(i) == s.charAt(j)){
                    flag5 = true;
                }
            }
        }
        return flag1 && flag2 && flag3 && flag4 && flag5;
    }

    public static void main(String[] args) {
        Password  password = new Password();
        System.out.println( password.checkStrongPassword("Neopet2001"));
    }
}

