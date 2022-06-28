package ThucHanhSo6.Bai3;

public class PS extends So {
    private int tu;
    private int mau;

    public PS() {
        tu = 0;
        mau = 1;
    }

    public PS(int n) {
        this.tu = n;
        this.mau = 1;
    }

    public PS(int t, int m) {
        this.tu = t;
        this.mau = m;
    }

    public PS(PS p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public int layTu() {
        return tu;
    }

    public int layMau() {
        return mau;
    }

    public void ganTu(int tu) {
        this.tu = tu;
    }

    public void ganMau(int mau) {
        if (mau > 0) this.mau = mau;
    }
    public void hienThi() {
        System.out.println(tu + "/" + mau);
    }
    public void hienThi(String s) {
        System.out.println(s);
    }
    public void rutGon(){
        int t =Math.abs(tu);
        int m = Math.abs(mau);
        int ucln =0;
        while(t != m){
            ucln = (t > m) ? (t-=m) : (m-=t);
        }
        tu = tu / ucln;
        mau = mau / ucln;
    }
    public PS congPhanSo(PS ps){
        PS ps1 = new PS();
        if(this.mau == ps.mau){
            ps1.tu = this.tu +ps.tu;
            ps1.mau = this.mau;
            return ps1;
        }
        ps1.tu = ps.tu*this.mau + ps.mau*this.tu;
        ps1.mau = this.mau*ps.mau;
        return ps1;
    }
//    public boolean checkSoNguyen() {
//        PS ps = new PS(this.tu, this.mau);
//        ps.rutGon();
//        if (ps.mau == 1) return true;
//        else return false;
//    }

//    public int chuyenSoNguyen() {
//        PS ps = new PS(this.tu, this.mau);
//        ps.rutGon();
//        int i = 0;
//        if (ps.checkSoNguyen() == true) {
//            i = ps.tu;
//        } else {
//            return 0;
//        }
//        return i;
//    }
//    public int tongHaiSoNguyen(PS ps) {
//        PS ps1 = new PS(this.tu, this.mau);
//        int sum = 0;
//        if (ps.checkSoNguyen() == true && ps1.checkSoNguyen() == true) {
//            sum = ps.layTu() + ps1.layTu();
//        } else {
//            return 0;
//        }
//        return sum;
//    }

    @Override
    public double giaTri() {
        return (double) tu/mau;
    }
}
