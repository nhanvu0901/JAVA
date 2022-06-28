package ThucHanhSo6.Bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class Dictionary  {

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        listTu listValue2 = new listTu();
        listTu listValue1 = new listTu();

        Value value1 = new Value("danh tu" ,"thu cung" );
        Value value2 = new Value("dong tu","nung thu cung");

        Value value3 = new Value("dong tu" ,"dit nhau" );
        Value value4 = new Value("danh tu" ,"gioi tinh" );

        listValue1.them(value1);
        listValue1.them(value2);

        listValue2.them(value3);
        listValue2.them(value4);


        String tuTiengAnh2 = "sex";
        tuDien.them("sex",listValue2);
        tuDien.them("pet",listValue1);

        System.out.println("Nghia cua tu "+tuTiengAnh2+" la");
        tuDien.layNghia("sex");

        System.out.println("Nghia cua tu pet la");
        tuDien.layNghia("pet");
    }
}
