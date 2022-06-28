import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int array[], int x, int low, int high) {

        // Trả về chỉ mục của x nếu nó có trong arr[l..r]
        // ngược lại trả về -1
        //low vaf high laf vị trí
        if (high >= low) {
            int mid = low + (high-low) / 2; // chỉ số bắt đầu từ 0 làm thế này để cộng vs low để tìm index ở bước cuối cùng cho chính xác vd hai số sát nhau

            if (array[mid] == x) return mid;//if found ar mid then return mid

            // so sánh các phần tử ở sau mid bằng cách cho high=mid-1
            // Nếu phần tử nhỏ hơn , thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (array[mid] > x) return binarySearch(array, x, low, mid - 1);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            //so sánh các phần tử ở phía lơn hơn mid mid bằng cách cho low = mid +1
           else  return binarySearch(array, x, mid + 1, high);
        }
        /* else */
        return -1; // nếu phần tử không có trong m thì trả về -1
    }
    public static void main(String args[]) {


            BinarySearch ob = new BinarySearch();
            int array[] = { 3, 4, 5, 6, 7, 8, 9,10};
            int n = array.length;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap so can tim ");
            int x = sc.nextInt();
            int result = ob.binarySearch(array, x, 0, n-1);//có thế viết là 6 vì có 6 vị trí(tính cả 0)
            if (result == -1)
                System.out.println("Not found");
            else
                System.out.println("Element found at index " + result);
        }
}
//  Ví dụ giải thích https://niithanoi.edu.vn/binary-search.html
