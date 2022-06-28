package BaiDSNV;



public class DSNV {
    private NV[] ds;
    private int soNV;

    public DSNV(int max){
        ds = new NV[max];
        soNV=0; // Số NV ban đầu khi khởi tạo sẽ có giá trị bằng 0
    }

    public void them(NV nv){
        ds[soNV++] = nv; // soNV này chính là số nhân viên =0 ỏ trên
    }

    public void lietKe(){
        System.out.println("-------dsnv:----------");
        for (int i = 0; i < soNV; i++) {
            ds[i].hienThi();
        }
    }

    public void lietKe(String loainv){
        System.out.println("-------dsnv"+loainv+":----------");
        for (int i = 0; i < soNV; i++) {
            if(ds[i].loaiNV().equals(loainv))
                ds[i].hienThi();
        }
    }

    public void tongLuong(){
        double t=0.0;
        for (int i = 0; i < soNV; i++) {
            t+=ds[i].layLuong();
        }
        System.out.println("tongluong="+t);
    }

    public void dsHDDH(){
        System.out.println("-------dsnvhddh:----------");
        for (int i = 0; i < soNV; i++) {
            if(ds[i].loaiNV().equals("HD"))
            {
                if(ds[i].laNVHDDH()){
                    ds[i].hienThi();
                }
            }
        }
    }

}
