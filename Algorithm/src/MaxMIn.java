public class MaxMIn {
    public static int max(int a, int b){
        return(a>b)?a:b;
    }
    public static int findMax(int a[],int n ) {
        if(n == 1) return a[0];
        return max(a[n-1],findMax(a,n-1));//so sanh phan tu cuoi vs cac phan tu con lai nhg neu phan tu cuoi be hon thi doi thanh b va tiep tuc so sanh
    }
    public static int findMax2(int a[],int start ,int end){
        if(start == end) return a[start];
        return max(a[start],findMax2(a,start+1,end));
    }
    public static void main(String[] args) {
        MaxMIn b = new MaxMIn();
        int array[] = { 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println("Gia tri lon nhat "+ b.findMax2(array,0,7));
        System.out.println("Gia tri lon nhat "+ b.findMax(array,8));

    }
}
