package Tuan8.Lession4.Excersise2;

public class TestNV {
    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien("Vu Trong Nhan",100,2,100000000);
        NhanVien nhanVien2 = new NhanVien("Nguyen Van A",200,2,10000000);
        nhanVien1.inTTin();
        nhanVien2.inTTin();
        NhanVien[] nhanViens = new NhanVien[2];
        nhanViens[0] = nhanVien1;
        nhanViens[1] = nhanVien2;
        Double tien = NhanVien.sumOfSalary(nhanViens);
        System.out.println(tien);
    }
}
