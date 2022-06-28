package JavaNangCao.VectorExample;

import java.util.Date;

public class    SV {
    protected String hoTen;
    protected Date ngaySinh;
    protected float dtb;



    public SV(String hoTen, Date ngaySinh, float dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }
    public SV(String hoTen ) {
        this.hoTen = hoTen;

    }

    public String layHoTen() {
        return hoTen;
    }
    public String layTen(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.lastIndexOf(" ");
        String kq = this.hoTen.substring(n+1);
        return kq;
    }
    public String layHo(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.indexOf(" ");
        String kq = this.hoTen.substring(0,n);
        return kq;
    }
    public String layDem(){
        this.hoTen = this.hoTen.trim();
        int n = this.hoTen.indexOf(' ');
        int m = this.hoTen.lastIndexOf(' ');
        String kq = this.hoTen.substring(n,m);
        return kq;
    }
    public void hienThi(){
        System.out.println("Ten sinh vien la "+this.layTen());
        System.out.println("Ho sinh vien la "+this.layHo());
        System.out.println("Dem sinh vien la "+this.layDem());
    }
    public boolean duocTN() { return true;}
}
