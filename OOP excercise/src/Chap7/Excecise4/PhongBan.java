package Chap7.Excecise4;

public class PhongBan {
    private String tenPhongBan;
      private int  soNhanVien ;
      public int So_NV_max;
      private NhanVien[] list;

  public PhongBan(int So_NV_max){
      list = new NhanVien[So_NV_max];
      soNhanVien =0;
  }
  public boolean themNV(NhanVien nhanVien){
      list[soNhanVien++] =nhanVien;
      return true;
  }
  public void xoaNV(NhanVien nhanVien){
      if((nhanVien.getTenNhanVien()==null)||(soNhanVien==0))
          return;
      int tg=-1;
      for (int i = 0; i < list.length; i++) {
          if(nhanVien.getTenNhanVien().equals(list[i].getTenNhanVien())  && nhanVien.getLUONG_MAX() == list[i].getLUONG_MAX()){
             tg = i;
             break;
          }
      }
      if(tg!=-1){
          for (int i = tg; i < soNhanVien; i++) {
              list[i] =list[i+1];
          }
          soNhanVien--;
      }
  }
  public double tinhTongLuong(){
      double tongLuong = 0;
      for (int i = 0; i < list.length; i++) {
          tongLuong +=list[i].tinhLuong();
      }
      return tongLuong;
  }
    public void inThongTin(){
        for (int i = 0; i < list.length; i++) {
            list[i].inThongTin();
        }
    }
}
