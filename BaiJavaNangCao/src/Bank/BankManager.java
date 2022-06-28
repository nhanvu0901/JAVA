package Bank;

import java.util.ArrayList;

public class BankManager {
    protected ArrayList<Account> list = new ArrayList<>();

    public BankManager(int max){
        list = new ArrayList<Account>(max);
    }

    public void themTK(Account tk){
        boolean flag = true;
        for (Account ac:list) {
            if (ac.getStk() == tk.getStk()){
                flag = false;
            }
        }
        if(flag == true) list.add(tk);
    }
    public void tinhTongTien(){
        int count=0;
        for (Account ac: list) {
            count += ac.getTienTrgTK();
        }
        System.out.println("Tong tien la "+count);
    }
}
