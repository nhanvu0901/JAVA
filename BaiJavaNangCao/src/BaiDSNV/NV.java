package BaiDSNV;

public abstract class  NV {
    protected String hoTen;
    protected String phong;

    public NV(String ht,String p){
        hoTen=ht;
        phong=p;
    }

    public void hienThi(){
        System.out.println("hoTen: "+hoTen+" phong: "+phong);
    }

    public abstract String loaiNV();

    public abstract double layLuong();

    public boolean laNVHDDH(){
        return true;
    }
}