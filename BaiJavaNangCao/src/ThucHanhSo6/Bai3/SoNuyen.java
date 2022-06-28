package ThucHanhSo6.Bai3;

public class SoNuyen extends So{
    int nguyen;

    public SoNuyen(int nguyen) {
        this.nguyen = nguyen;
    }

    public int getNguyen() {
        return nguyen;
    }

    public void setNguyen(int nguyen) {
        this.nguyen = nguyen;
    }

    @Override
    public double giaTri() {
        return (double) nguyen;
    }
}
