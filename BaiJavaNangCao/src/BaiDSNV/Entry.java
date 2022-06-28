package BaiDSNV;

public class Entry {
    public static void main(String[] args) {
        DSNV ds=new DSNV(500);
        NV nv1 = new NVBC("phi ngu","Ke toan",2.0,2);
        NV nv2 = new NVBC("hoang ngu","cntt",4.0,2);



        NV nv6=new NVHD("Ng Thi F","P2",10000000,"DH");
        NV nv7=new NVHD("Ng Thi G","P2",9000000,"NH");
        NV nv10=new NVHD("Ng Thi K","P2",10000000,"DH");
        ds.them(nv1);
        ds.them(nv2);


        ds.them(nv6);
        ds.them(nv7);

        ds.them(nv10);

        ds.lietKe();
        ds.lietKe("BC");
        ds.lietKe("HD");
        ds.tongLuong();
        ds.dsHDDH();






    }
}
