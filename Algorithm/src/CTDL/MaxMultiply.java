package CTDL;

public class MaxMultiply {
    public static void sort(int[]a){
        for(int i = 0; i<a.length; i++ ){
            for(int j = i+1; j<a.length; j++){

                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void find(int[] a) {
        int[] negative = new int[100];

        int[] positive = new int[100];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                negative[i] = a[i];
            } else {
                positive[i] = a[i];
            }
        }
        sort(negative);
        int nega = negative[0];
        int agen = negative[1];
        int multy1 = nega * agen;


        sort(positive);
        int posi = positive[positive.length-1];
        int isop = positive[positive.length-2];
        int multy2= posi *isop;

      if(multy1 > multy2){
          System.out.println("{"+nega+","+agen+"}");
      }
      else
          System.out.println("{"+posi+","+isop+"}");
    }

    public static void main(String[] args) {
        int[]a = {3,-5,7,-8,-10,-4,2,-100};
        find(a);
    }
}
