package DeQuy;

public class SubArrayBackTracking {
    static void printSubArrays(int []arr, int start, int end)
    {
        // Stop if we have reached the end of the array
        if (end == arr.length)
            return;

            // Increment the end point and start from 0
        else{
            if (start > end) {// start va end chỉ là vị trí
                printSubArrays(arr, 0, end + 1);
            }
            // Print the subarray and increment the starting point
            else // ban dau start va end deu =0 in ra 1 luc sau vi start =1 > end =0  thi len cai if o tren in 1,2 ra sau do tang start = end =1  in 2
            {
                System.out.print("[");
                for (int i = start; i < end; i++){
                    System.out.print(arr[i]+", ");
                }

                System.out.println(arr[end]+"]");
                printSubArrays(arr, start + 1, end);
            }
        }

        return;
    }

    public static void main(String args[])
    {
        int []arr = {1, 2, 3,4};
        printSubArrays(arr, 0, 0);

    }
}
