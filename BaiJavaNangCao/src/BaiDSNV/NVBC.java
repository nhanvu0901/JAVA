package BaiDSNV;

public class NVBC extends NV{
    protected double hesoLuong;
    protected int sonamCT;

    public NVBC(String ht,String p,double hsl,int n){
        super(ht,p);
        hesoLuong=hsl;
        sonamCT=n;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("hesoLuong: "+hesoLuong+" sonamCT: "+sonamCT);
    }
    @Override
    public String loaiNV(){
        return "BC";
    }

    public double layLuong(){
        if(sonamCT<10)
            return 1000000*hesoLuong;
        else
            return 2*1000000*hesoLuong;
    }


}