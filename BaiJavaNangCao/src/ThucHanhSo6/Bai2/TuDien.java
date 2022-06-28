package ThucHanhSo6.Bai2;

import java.util.HashMap;

public class TuDien {
    HashMap<String,listTu> tuDien = new HashMap<>();

    public TuDien(){
        tuDien = new HashMap<String,listTu>();

    }
    public void them(String tu , listTu list){
        tuDien.put(tu,list);
    }
    public void layNghia(String tu){
        tuDien.get(tu).display();
    }

}
