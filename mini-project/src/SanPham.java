import java.util.ArrayList;



public class SanPham {
private String tenSP;
private String maSP;
private String xuatSu;
private String NSX;
private String HSD;
private String NNK;
private int soLuong;
private int gia;

public SanPham(String tenSP, String maSP, String xuatSu, String nSX, String hSD, String nNK, int soLuong, int gia
		) {
	super();
	this.tenSP = tenSP;
	this.maSP = maSP;
	this.xuatSu = xuatSu;
	NSX = nSX;
	HSD = hSD;
	NNK = nNK;
	this.soLuong = soLuong;
	this.gia = gia;
	
}
public String getTenSP() {
	return tenSP;
}
public void setTenSP(String tenSP) {
	this.tenSP = tenSP;
}
public String getMaSP() {
	return maSP;
}
public void setMaSP(String maSP) {
	this.maSP = maSP;
}
public String getXuatSu() {
	return xuatSu;
}
public void setXuatSu(String xuatSu) {
	this.xuatSu = xuatSu;
}
public String getNSX() {
	return NSX;
}
public void setNSX(String nSX) {
	NSX = nSX;
}
public String getHSD() {
	return HSD;
}
public void setHSD(String hSD) {
	HSD = hSD;
}
public String getNNK() {
	return NNK;
}
public void setNNK(String nNK) {
	NNK = nNK;
}
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}
public int getGia() {
	return gia;
}
public void setGia(int gia) {
	this.gia = gia;
}



}
