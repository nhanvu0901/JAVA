package CTDL;

import java.util.LinkedList;
import java.util.Queue;

public class findTheMissing {
        public static void main(String[] args) {
            int[] a = {0,1,2,4,6,7,8};
            int index =0;
            int posi =0;
            Queue<Integer> list=  new LinkedList<>();
            for (int i = 1; i < a.length; i++) {
                list.add(a[i]);
                if(a[index]+1 != a[i]){
                    posi = a[index] +1;
                    list.add(posi);
                }
                index++;
            }
           while(!list.isEmpty()){
               System.out.println(list.poll());
           }
        }
}
