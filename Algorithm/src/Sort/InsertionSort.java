package Sort;

public class InsertionSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j= i-1;
            while(j >= 0 && arr[j] > value){
                arr[j+1] = arr[j];
                j--; // khi j==0 neu value van be hon thi cho a[0] len thanh a[1]
                     // dong thoi j luc nay = -1
            }

            arr[j+1] = value; // luc nay gan a [vi tri minh tim ra de chen sau phan tu lon hon no]
                              // = vaule
        }
    }

    // Xuất mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
