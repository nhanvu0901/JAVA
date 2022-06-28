package QuanLyThuVien;

public class Entry {
    public static void main(String[] args) {
        DSTL ds = new DSTL(500);
        TAILIEU tl1 = new Sach("s1", "TTHVTCX", "gia 2", "NNA", "Nha Nam", 2017);
        tl1.hienThi();

        System.out.println("---------------------------------------");

        TAILIEU tl2 = new Sach("s2", "Tieng Viet 1", "gia 3", "TNBS", "NXB Tre", 2016);
        TAILIEU tl3 = new TAPCHI("tc1", "The gioi thuc vat", "gia 4", "Sinh hoc", 1213, 2021);
        TAILIEU tl4 = new CD("cd1", "English listening", "gia 3", 126, "Tieng Anh");
        ds.them(tl1);
        ds.them(tl2);
        ds.them(tl3);
        ds.them(tl4);
        ds.xem("s1");


        System.out.println("---------------------------------------");
      
        System.out.println("---------------------------------------");
        ds.tim("Tieng Viet 1","TNBS");
        //ds.lietKe();
        ds.tim("The gioi thuc vat", "Sinh hoc", 1213, 2021);
        ds.tim("English listening", 126, "Tieng Anh");

    }
}
