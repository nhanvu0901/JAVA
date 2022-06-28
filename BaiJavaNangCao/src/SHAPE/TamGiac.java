package SHAPE;

public class TamGiac  extends HINH{
    double c1,c2,c3;

    public TamGiac(double c1, double c2, double c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public double DienTich() {
       double p = (c1 +c2 + c3)/2;

       return  Math.sqrt(p*(p-c1)*(p-c2)*(p-c3));
    }



    @Override
    public void hienThiS() {
        System.out.println("Dien tich "+DienTich());
    }
}
