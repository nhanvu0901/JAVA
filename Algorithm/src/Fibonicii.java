import java.util.Scanner;

public class Fibonicii {
    public static boolean findFibonicii(int n) {
        if (n < 0) return false;
        if (n == 1 || n == 0) return true;

        int fn_2 = 0;
        int fn_1 = 1;
        int fn = fn_1;
        while (fn <= n) {
            if (fn == n) return true;
            fn = fn_1 + fn_2;
            fn_1 = fn;
            fn_2 = fn_1;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu trong mang ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("");

        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*100);
            if (findFibonicii(a[i])) {
                System.out.print(a[i]+" ");
            }
        }
    }
}