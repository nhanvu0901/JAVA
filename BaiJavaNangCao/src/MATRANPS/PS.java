package MATRANPS;

public class PS {
    int tu;
    int mau;

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public PS(){}
    public PS(int n){
        this.tu = n;
        this.mau=1;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        if(mau >0){
            this.mau = mau;
        }
    }

    public void hienThi(){
        System.out.print(tu + "/"+mau+" ");
    }


    public void tang(int n){
        tu = this.getTu() + this.getMau()*n;
        mau = this.getMau();
        System.out.println("Cong phan so voi "+n+" ket qua la "+tu+"/"+mau);
    }
    public void gap(int n){
        tu = this.getTu() *n;
        mau = this.getMau()*n;
        System.out.println("Nhan phan so voi "+n+" ket qua la "+tu+"/"+mau);
    }
    public PS cong(int n){
        PS p = new PS();
        p.tu = this.getTu() + this.getMau()*n;
        p.mau = this.getMau();
        return p;
    }
    public PS congPhanSo(PS ps){
        PS ps1 = new PS();
        if(this.getMau() == ps.mau){
            ps1.tu = this.tu +ps.tu;
            ps1.mau = this.mau;
            return ps1;
        }
        ps1.tu = ps.tu*this.getMau() + ps.mau*this.getTu();
        ps1.mau = this.getMau()*ps.mau;
        return ps1;
    }
    public PS tru(int n){
        PS p = new PS();
        p.tu = this.getTu() - this.getMau()*n;
        p.mau = this.getMau();
        return p;
    }
    public PS truPhanSo(PS p){
        if(this.getMau() == p.mau){
            p.tu = this.tu - p.tu;
            p.mau = this.mau;
            return p;
        }
        p.tu = p.tu*this.getMau() - p.mau*this.getTu();
        p.mau = this.getMau()*p.mau;
        return p;
    }
    public PS nhan(int n){
        PS p = new PS();
        p.tu = this.getTu()*n;
        p.mau = this.getMau();
        return p;
    }
    public PS nhanPhanSo(PS p){
        PS ps = new PS();
        ps.tu = p.getTu()*this.getTu();
        ps.mau = p.getMau()*this.getMau();
        return ps;
    }
    public PS chia(int n){
        PS p = new PS();
        p.tu = this.getTu()/n;
        p.mau = this.getMau()/n;
        return p;
    }
    public PS chiaPhanSo(PS p){
        PS ps = new PS();
        ps.tu = p.getTu()*this.getMau();
        ps.mau = p.getMau()*this.getTu();
        return ps;
    }

    public  int soSanh(PS p){
        double pss = (double)p.tu/p.mau;
        double pss1 = (double)this.getTu()/this.getMau();
        if(pss == pss1){
            return 0;

        }
        else{
            if(pss> pss1)
                return 1;
            else return -1;
        }
    }
    public int UCLN(int a , int b){
        while(a != b ){
            if(a>b){
                a -= b;
            }
            else b-=a;
        }
        int ucln = b; // khi hai so a == b thi thoat vong lap luc nay co the cha ve a hoac b
        return ucln;
    }
    public PS rutGon(){
        int n = UCLN(this.getTu(),this.getMau());
        PS ps = new PS(this.tu,this.mau);
        if(this.tu % n ==0){
            ps.tu = this.getTu()/n;
        }
        if(this.mau % n ==0){
            ps.mau = this.getMau()/n;
        }
       return ps;

    }
}


