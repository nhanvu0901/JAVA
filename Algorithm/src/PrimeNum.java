import java.util.Random;
import java.util.Scanner;

public class PrimeNum {
    public static boolean Prime(int n) {
        boolean flag = true;// gắn biến flag là đúng
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                flag =false;//Set flag to false and break out of the loop
                            // if the condition is not satisfied
            }
        }
        return flag;//trả về giá trị của flag ở mọi trường hợp


        // mình gán flag = true bởi vì cái điều kiện trong vòng lặp là mình  ra cái sai để chọn ra cái
        //đúng còn nếu vòng lặp chọn ra đk để nó đúng thì

        //Quan trọng chính là cái vòng lặp xác định xem vòng lặp là chọn ra đúng lun hay chọn ra cái sai
        //Đúng thì set flag = true trong vòng lặp sai thì ngược lạilại
         }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao do dai cua day ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println("Mang sinh ngau nhien la");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (Prime(arr[i])) {
                count++;
                System.out.println("So nguyen to la : "+arr[i]+" ");
            }
            }
        if(count ==0) System.out.println("Khong co so nguyen to");
        }
    }


