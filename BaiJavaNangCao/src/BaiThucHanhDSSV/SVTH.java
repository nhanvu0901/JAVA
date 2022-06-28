package BaiThucHanhDSSV;

import java.util.Date;

public class SVTH extends SV{
    protected String tenDT;
    protected double diemDT;

    public SVTH(String s, Date ns, double d, String tenDT, double diemDT) {
        super(s, ns, d);
        this.tenDT = tenDT;
        this.diemDT = diemDT;
    }
    public void hienThi()
    {
        super.hienThi();
        System.out.println(" tenDT: "+ tenDT+" diemDT: "+diemDT);
    }

    public boolean duocTN(){
        if((diemDT>5.0)&&(this.layDTB()>5.0))
            return true;
        return false;
    }
    public boolean loaiSV(String s){
        if(s.equalsIgnoreCase("th")){
            return true;
        }
        return false;
    }
}
