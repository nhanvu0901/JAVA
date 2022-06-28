package SHAPE;

public class HinhTron extends HINH {
    protected double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double DienTich() {

        return  Math.pow(banKinh,2) * Math.PI;
    }

    @Override
    public void hienThiS() {
        System.out.println("Dien tich "+DienTich());
    }
}
