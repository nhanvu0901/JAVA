package Sort;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QuickSort {
    // Hàm nhận phần tử cuối làm chốt
    //đặt các phần tử nhỏ hơn nó ở trước
    //lờn hơn nó ở phía sau
    public static int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // Neu phan tu xet nho hon chot
            if (pivot > a[j]) {
                i++;//tu tren xuong
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

            }
        }
        // swap a[i+1] va a[high] (pivot)
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i+1;
    }
    // arr[] --> Mảng cần được sắp xếp,
    // low --> chỉ mục bắt đầu,cua day can sort
    // high --> chỉ mục kết thúc cua day can sort
    public static int sort(int a[],int low , int high){
        //low và high là vị trí index của mảng
        if (low < high) {

            // pi là chỉ mục của chốt, arr[pi] vị trí của chốt
            int pi = partition(a, low, high);

            // Sắp xếp đệ quy các pshần tử
            // trước phân vùng và sau phân vùng
            sort(a, low, pi - 1);// sắp xếp các phần tử ở phía bé hơn của chốt
            sort(a, pi + 1, high);
        }
        return -1;
    }
    static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
        a[i] =sc.nextInt();
        }

        sort(a, 0, n - 1);

        int num=a[0];
        Stack<Integer> list = new Stack<>();
        for (int i = 1; i < a.length; i++) {
            if (a[i] - a[i - 1] > 1) {
                num = a[i - 1] + 1;

            }
            if(i == a.length-1){
                num = a[i]+1;
            }

                break;

        }
        System.out.println(num);
        }
        }
