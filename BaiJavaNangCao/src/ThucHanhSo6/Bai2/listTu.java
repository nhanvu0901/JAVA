package ThucHanhSo6.Bai2;

import java.util.ArrayList;

public class listTu {
    ArrayList<Value> list = new ArrayList<>();

    public void display(){
        for (Value value:list) {
            value.hienThi();
        }
    }

    public listTu(){
        list = new ArrayList<Value>();
    }
    public void them(Value value){
        list.add(value);
    }
}
