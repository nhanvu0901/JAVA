package Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public class SV implements Comparable<SV>{
    private String hoTen;
    private Date ngaySinh;
    private double dtb;

    public SV(String hoTen, Date ngaySinh, double dtb) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dtb = dtb;
    }

    public Date layNgaySinh(){
        return ngaySinh;
    }

    public double layDTB(){
        return dtb;
    }

    public String layHoten(){
        return hoTen.trim();
    }

    public String layTen()
    {
        int n;
        String kq;
        kq=hoTen.trim();
        n = kq.lastIndexOf(" ");
        kq = kq.substring(n+1);
        return kq;
    }

    public String layHo()
    {
        int n;
        String kq;
        kq = hoTen.trim();
        n = kq.indexOf(" ");
        kq = kq.substring(0,n);
        return kq;
    }

    public String layDem()
    {
        int n,m;
        String kq;
        kq = hoTen.trim();
        n = kq.indexOf(" ");
        m = kq.lastIndexOf(" ");
        kq = kq.substring(n+1,m);
        return kq;
    }

    public int layTuoi(){
        LocalDate date = LocalDate.now();
        int namtuoi = date.getYear() - ngaySinh.getYear();

        if(date.getMonthValue()>ngaySinh.getMonth())
            namtuoi++;
        else if(date.getMonthValue()==ngaySinh.getMonth()){
            if(date.getDayOfMonth()>=ngaySinh.getDate())
                namtuoi++;
        }

        return namtuoi;
    }

    public String layXepLoai(){
        if(dtb<5.0)
            return "Kem";
        else if(dtb<6.5)
            return "Trung Binh";
        else if(dtb<8.0)
            return "Kha";
        else return "Gioi";
    }

    public void hienThi(){
        System.out.println("Sinh vien " + hoTen + " sinh ngay " + ngaySinh.getDate() + "/" + ngaySinh.getMonth() + "/" + ngaySinh.getYear() + " co diemtb = "+dtb);
    }


    @Override
    public int compareTo(SV o) {

        int n= this.layTen().trim().toLowerCase().compareTo(o.layTen().trim().toLowerCase());
        if(n == 0)
            n = this.layDem().trim().toLowerCase().compareTo(o.layDem().trim().toLowerCase());
        if(n ==0)
            n  = this.layHo().trim().toLowerCase().compareTo(o.layHo().trim().toLowerCase());

        if(n != 0) return n; // Neu ten chung se sap theo tuoi

        Integer x1 = this.layTuoi();
        Integer x2 = o.layTuoi();
        int m = x1.compareTo(x2);

        return m;
    }

}