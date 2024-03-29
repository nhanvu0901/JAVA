package Sort;

public class SelectionSort {

    public void sort(int[] arr){
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//
//            // Swap the found minimum element with the first
//            // element
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length ; j++) {
                if(arr[min] > arr[j]){
                   min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    // Xuất mảng
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = { 64, 25, 12, 22, 11 };
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
}
