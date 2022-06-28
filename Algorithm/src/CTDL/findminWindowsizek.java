package CTDL;

import java.util.ArrayDeque;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class findminWindowsizek {
    public static int findSumArray(int[]array , int n) {
        int LowestSum = 0;
        int previousSum = 0;
        int minIndex =0;
        for (int i = 0; i <= array.length - n; i++)
        {
            if (i == 0)
            {
                for (int j = 0; j < n; j++)
                {
                    LowestSum += array[j];
                }

                previousSum = LowestSum;

            }
            else
            {
                int currentSum = previousSum - array[i - 1] + array[i + n - 1];
                if (currentSum < LowestSum)
                {
                    LowestSum = currentSum;
                    minIndex = i;

                }
                previousSum = currentSum;//sau khi ket thuc thi gan cai sum luc sau thanh cai sum bay gio
            }
        }

        return minIndex;
    }
    public static void main(String[] args) {
        int[] a ={1,3,5,3,7,6,7,-2,14,-8};
        int n = findSumArray(a,3);

        for (int i = n; i < a.length; i++) {
            System.out.print("["+a[i]+"]");

        }
    }

}
