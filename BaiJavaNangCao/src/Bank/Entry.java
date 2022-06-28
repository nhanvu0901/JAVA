package Bank;

public class Entry {
    public static void main(String[] args) {
        Account ac1 = new Account(1111,1000);
        Account ac2 = new Account(2222,2000);
        BankManager list = new BankManager(2);
        list.themTK(ac1);
        list.themTK(ac2);

        ac1.chuyenTien(ac2,500);
        ac2.rutTien(200);
        ac1.napTien(1000);
        ac1.hienThi();
        ac2.hienThi();
        list.tinhTongTien();
    }
}
