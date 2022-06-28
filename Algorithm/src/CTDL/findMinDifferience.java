package CTDL;

import java.util.Scanner;

public class findMinDifferience {


    public static int BinarySearch(int[] array ,int x ,int low , int high) {

        while (low < high){
            int mid = (low+high)/2;
            if (array[mid] < x){ // Nếu array[mid] > x thì ở dưới kia xét low vs low+1
                low = mid+1;
            }
            else{ // chú ý trường hợp nó bằng với lớn hơn các thứ
                high = mid-1;
            }
        }
        if (array[low] == x){
            return low;
        }


        int negative1 =Math.abs(array[low] -x);
        int negative2= Math.abs(array[low-1]-x);
        int m = (negative1 > negative2) ? low-1 : low;

        return  m;
    }

    public static void main(String args[]) {
        findMinDifferience a = new findMinDifferience();
        int[] array ={100,140,160,403,406,500};

        int n = array.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tim ");
        int x = sc.nextInt();
        int result = a.BinarySearch(array, x, 0, n-1);//có thế viết là 6 vì có 6 vị trí(tính cả 0)
        System.out.println(array[result]);

    }
}

