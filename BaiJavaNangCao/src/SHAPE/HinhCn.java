package SHAPE;

public class HinhCn extends HINH{
    protected double dai,rong;

    public HinhCn(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double DienTich() {
        return dai * rong;
    }

    @Override
    public void hienThiS() {
        System.out.println("Dien tich "+DienTich());
    }
}
