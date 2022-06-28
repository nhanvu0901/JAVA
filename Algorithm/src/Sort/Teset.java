package Sort;

public class Teset {
    public static void sort(int[]a){
        for (int i = 0; i < a.length; i++) {
            int value = a[i];
            int j =i-1;
            while(j >=0 && a[j] >value){
                a[j+1] = a[j];

                j--;
            }
            a[j+1] = value;
        }
    }

    public static void main(String[] args) {
        int a[] ={9,8,7,6,5,4};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
