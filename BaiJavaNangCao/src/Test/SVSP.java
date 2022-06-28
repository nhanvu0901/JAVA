package Test;





import java.util.Date;

public class SVSP extends SV {
    protected String noiTT;
    protected double diemTT;

    public SVSP(String s, Date ns, double d, String noiTT, double diemTT) {
        super(s, ns, d);
        this.noiTT = noiTT;
        this.diemTT = diemTT;
    }


     public boolean duocTN() {
        if((this.diemTT >5.0) && (this.layDTB() >5.0)){
            return true;
        }
        return false;
    }


    public boolean loaiSV(String s) {
        if(s.equalsIgnoreCase("sp")){
            return true;
        }
        return false;
    }


}
