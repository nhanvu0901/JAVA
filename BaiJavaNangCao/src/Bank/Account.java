package Bank;
public class Account {
    // Instance variables
    private double tienTrgTK;
    private int stk;
    // Constructors
    public Account(double initialBalance) {
        tienTrgTK = initialBalance;
    }

    public Account(int stk, double balance) {
        this.tienTrgTK= balance ;
        this.stk = stk;
    }

    public Account() {
        tienTrgTK = 100;
    }

    public double getTienTrgTK() {
        return tienTrgTK;
    }

    public void setTienTrgTK(double tienTrgTK) {
        this.tienTrgTK = tienTrgTK;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }
    // Instance methods

   public void chuyenTien(Account ac,int x){
        if(this.tienTrgTK > x){
            this.tienTrgTK = this.tienTrgTK -x;
            ac.tienTrgTK = ac.tienTrgTK +x;
            System.out.println("Chuyen tien thanh cong");
        }
        else{
            System.out.println("Fail");
        }
   }
   public  void rutTien( int x){
        if(this.tienTrgTK > x){
            this.tienTrgTK = this.tienTrgTK-x;
            System.out.println("Tai khoan "+this.stk+" rut "+x+" thanh cong");
        }
   }
   public void napTien(int x){
        if(x >0){
            this.tienTrgTK += x;
            System.out.println("Tai khoan "+this.stk+" nap "+x+" thanh cong");
        }

   }
   public void hienThi(){
       System.out.println("Tien trong tk cua tai  khoan "+stk+" la: "+tienTrgTK);
   }
}
