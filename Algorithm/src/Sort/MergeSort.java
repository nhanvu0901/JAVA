package Sort;

public class MergeSort {
    public static void merge(int[]a , int low ,int mid ,int high){
        int n1 = mid-low +1;
        int n2 = high -mid;
        int[] L= new int[n1];
        int[] R= new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = a[low +i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = a[mid+1+i];
        }
        int i = 0, j = 0;

        int k = low;
        while(i < L.length && j <R.length){
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<L.length){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<R.length){
            a[k] = R[j];
            j++;
            k++;
        }

    }

    public static void sort(int[]arr,int low , int high){
        if(high >low){
            int mid = (high +low)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array")    ;
        printArray(arr);
    }
}
