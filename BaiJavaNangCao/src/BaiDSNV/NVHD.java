package BaiDSNV;

public class NVHD extends NV{
    protected double luong;
    protected String loaiHD;

    public NVHD(String ht,String p,double l,String loai){
        super(ht,p);
        luong=l;
        loaiHD=loai;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("luong: "+luong+" loaihd: "+loaiHD);
    }
    @Override
    public String loaiNV(){
        return "HD";
    }

    public double layLuong(){
        return luong;
    }

    public boolean laNVHDDH(){
        if(loaiHD.equals("DH"))
            return true;
        else return false;
    }
}