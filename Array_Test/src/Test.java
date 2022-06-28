class Sum extends Thread{
    int low, up, S;
    public Sum(int a, int b){
        low = a; up = b; S= 0;
        System.out.println("This is Thread "+this.getId());
    }
    public void run(){
        for(int i= low; i < up; i ++) S+= i;
        System.out.println(this.getId()+ " : " + S);
    }
}
public class Test {
    public static void main(String[] args) {
        Sum T1 = new Sum(1,100); T1.start();
        Sum T2 = new Sum(10,100); T2.start();
        System.out.println("Main process terminated");
    }
}
