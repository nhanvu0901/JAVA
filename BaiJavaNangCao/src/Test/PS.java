package Test;

public class PS {
    int tu ;
    int mau;

    public PS(){}

    public PS (int n){
        this.tu = n;
        this.mau=1;
    }

    public PS(int tu, int mau) {
        this.tu = tu;

        if(mau <0){
            System.out.println("Khong ton tai");
        }
        else this.mau = mau;
    }
    public PS(PS ps){
        ps.mau = mau;
        ps.tu =tu;
    }

    public int LayTu() {
        return tu;
    }

    public void ganTu(int tu) {
        this.tu = tu;
    }

    public int LayMau() {
        return mau;
    }

    public void ganMau(int mau) {
        if(mau >0){
            this.mau = mau;
        }
    }
    public static PS  rutGon(PS ps){
        int ucln = UCLN(ps.tu,ps.mau);
        if(ps.tu % ucln ==0){
            ps.tu= ps.tu/ucln;
        }

        if(ps.mau % ucln ==0){
            ps.mau = ps.mau/ucln;
        }

        return ps;
    }
    public static int UCLN(int a, int b){
        while(a != b){
            if(a>b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return b;
    }

    PS cong(int n){
        PS ps = new PS();
        ps.tu = this.tu + this.mau*n;
        ps.mau = this.mau;
        return ps;
    }
    PS cong(final PS ps){
        PS ps1  = new PS(this.tu,this.mau);
        if(ps1.mau == ps.mau){
            ps.tu = ps.tu +ps1.tu;
            ps.mau = ps1.mau;

            return ps;
        }
        ps.tu = ps.tu*ps1.mau + ps.mau*ps1.tu;
        ps.mau = ps.mau * ps1.LayMau() ;
        return  ps;

//        PS ps1  = new PS(this.tu,this.mau);
//        if(ps.mau == this.mau){
//            ps1.tu = ps.tu +this.tu;
//            ps1.mau = this.mau;
//
//            return ps1;
//        }
//        ps1.tu = ps.tu*this.mau + ps.mau*this.tu;
//        ps1.mau = ps.mau * this.LayMau() ;
//        return  ps1;
    }
    public static void  display(PS ps){
        if(ps.mau == 1){
            System.out.print(ps.tu);

        }
        else{
            System.out.print(ps.tu + "/"+ps.mau+" ");
        }
    }
    public static void main(String[] args) {
        PS ps = new PS(1,3);
        PS ps1 = new PS(9,3);
        PS ps3 = ps.cong(ps1);
        rutGon(ps3);
        display(ps3);
        display(ps1);
    }
}