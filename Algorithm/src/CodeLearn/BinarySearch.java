package CodeLearn;

public class BinarySearch {
    public static int find(int arr[] , int x){
        int low = 0 , high = arr.length-1;

        while(low < high){
            int mid = (high + low)/2;
            if(arr[mid] == x) return mid;

            if(arr[mid] > x){
                high = mid -1;
            }
            else low = mid +1;

        }
        double hieu1 =0;
        double hieu2 =0;
        int m =0;
       if(arr[low] == x) return low;

       else if(arr[low] >x){
            hieu1 = Math.abs(arr[low-1] - x);
            hieu2 = Math.abs(arr[low] - x);
             m = (hieu1 > hieu2) ? low : low-1;
           return m;
       }
        else{
            hieu1 = Math.abs(arr[low]-x);
            hieu2 = Math.abs(arr[low+1]-x);
            m = (hieu1 > hieu2) ? low+1 : low;
            return m;
       }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,10};
        System.out.println(find(arr,9));
    }
}
