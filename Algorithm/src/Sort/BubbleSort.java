package Sort;

class BubbleSort
{
    void bubbleSort(int a[], int n){
        for (int i = n-1; i >= 1; i--){
            boolean swapped= true;
            for (int j = 0; j < i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = false;
                }
            }
            if (swapped == true){ // tuc la neu ko can swaap thi break
                break;
            }
        }

    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr, arr.length);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}