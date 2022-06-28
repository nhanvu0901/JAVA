package MATRANPS;

public class MATRAN {
    private int[][] mat;
    private int soDong;
    private int soCot;
    private PS[][] matPS;// lay ra gia tri cua phan so tai hang i va cot j
    public MATRAN(){}

    public MATRAN(int d, int c) {
        this.soDong = d;
        this.soCot = c;
        mat = new int[d][c];
        matPS = new PS[d][c];
    }

    public MATRAN(int[][] mang, int m, int n) {
        this.mat = mang;
        this.soDong = m;
        this.soCot = n;
    }

    public MATRAN(MATRAN mt) {
        if (mt != null) {
            this.mat = mt.mat;
            this.soDong = mt.soDong;
            this.soCot = mt.soCot;
        } else {
            soDong = 1;
            soCot = 1;
        }
    }
    public void GanGiatri(int d,int c ,int n){
        mat[d][c] = n;
    }
    public int laySoDong() {
        return soDong;
    }

    public int laySoCot() {
        return soCot;
    }

    public void ganGiaTRiPS(int d, int c, PS gt) {
        matPS[d][c] = gt;
    }//gan gia tri cua phan so tai hang d va cot c

    public PS layGiaTriPS(int d, int c) {
        return matPS[d][c];
    }//lay gia tri cua phan so tai hang d cot c



    public  MATRAN cong(MATRAN mt) {

        MATRAN matran = new MATRAN(soDong, soCot);
        if (this.soDong != mt.soDong || this.soCot != mt.soCot) {
            return null;
        } else {
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {
                    matran.mat[i][j] = this.mat[i][j] + mt.mat[i][j];
                }
            }
        }
        return matran;
    }
    public  MATRAN congPS(MATRAN mt) {

        MATRAN matran = new MATRAN(soDong, soCot);

        if (this.soDong != mt.soDong || this.soCot != mt.soCot) {
            return null;
        } else {
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {

                   matran.matPS[i][j] = (mt.matPS[i][j].congPhanSo(this.matPS[i][j])).rutGon();

                }
            }
        }
        return matran;
    }

    public MATRAN tru(MATRAN mt) {
        MATRAN matran = new MATRAN(soDong, soCot);
        if (this.soDong != mt.soDong || this.soCot != mt.soCot) {
            return null;
        } else {
            for (int i = 0; i < soDong; i++) {
                for (int j = 0; j < soCot; j++) {

                    matran.mat[i][j] = this.mat[i][j] - mt.mat[i][j];
                }
            }
        }
        return matran;
    }
    public MATRAN nhanPS(MATRAN m){

        if(this.laySoCot() != m.laySoDong() ){
            return null;
        }
        else{
            int dong = this.laySoDong();
            int cot = m.laySoCot();
            PS[][] kq = new PS[dong][m.laySoCot()] ;
            MATRAN matran = new MATRAN(dong,cot);
            for (int i = 0; i < dong; i++) {
                for (int j = 0; j < cot; j++) {
                    kq[i][j] = kq[i][j].congPhanSo(this.matPS[i][j].nhanPhanSo(m.matPS[i][j]));

                   matran.matPS[i][j] = kq[i][j].rutGon();
                    }
                }
            return matran;
        }
    }
public void hienThi(){
    for (int i = 0; i < this.laySoDong(); i++) {
        for (int j = 0; j < this.laySoCot(); j++) {
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }
}

    public void hienThiPS() {
        for (int i = 0; i < this.laySoDong(); i++) {
            for (int j = 0; j < this.laySoCot(); j++) {
               this.layGiaTriPS(i,j).hienThi();
            }
            System.out.println();
        }
    }



}
