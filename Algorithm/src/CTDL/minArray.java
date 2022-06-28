package CTDL;

public class minArray {


    public static void main(String[] args) {
        int[] a = {0, 1, 2, 4,6,7,8,9};
        int num =0;
        int index = 0;
        int index1 =0;
        int index2=0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] -a[index2] ==2){
                ++num;
            }
           index2++;

        }

        int test[] = new int[num];

        for (int j = 1; j < a.length; j++) {

            if (a[j] - a[index] != 1) {
                test[index1] = a[index] + 1;
                index1++;
            }
            index++;

        }
        System.out.println(test[0]);


    }

}
