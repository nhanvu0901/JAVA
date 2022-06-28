package JavaNangCao;

import java.util.*;
class StringTokenExample {
    public static void main(String args[]) {
       /* String s = "Day la mot dong van ban. Dong nay co the chua dau phay;dau cham cau; ";
        StringTokenizer st = new StringTokenizer(s, " ,.;");
        System.out.println("So tu:" + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken()); // duyet mot lan khong duyet lai ve NULL
        }
        /// duyet qua cac phan tu neu tu day chua chua trong tu dien thi ta chen no vao neu no xuat hien roi thi gia tri la so lan xuat hien thi ta xoa no khoi tu dien xong tang so lan xuat hien 1 dv luu vao mot bien i
        System.out.println("---------------------------------------------");*/
        String tb = "The revolt of 35 House Republicans against their leader, California Rep. Kevin McCarthy -- who pushed strongly for the bill's defeat -- represents the strongest rebuke yet of the former President from his own party ranks, far more than the 10 Republicans who voted to impeach Trump over the Capitol mob scene. The surprising size of the Republican vote for the commission may indicate the politics of the issue are not yet set in stone and could give some Republicans pause as they consider their position on investigating the insurrection.\n";


        StringTokenizer st1 = new StringTokenizer(tb, " ,.;");

        Hashtable table = new Hashtable(); // tao ra mot table de luu tru tan so

        System.out.println("So tu trong cau: "+st1.countTokens());
        while(st1.hasMoreTokens()){
            Object object = st1.nextToken();
            System.out.println((String) object);
            if(!table.containsKey(object)){
                table.put(object,1); //Neu chua co doi tuong day thi cho no vao table va +1
            }
            else{ // neu khong thi xoa ob day di va gan object moi nhung co value moi la 2
                int n = (int) table.get(object);  // tra ve gia tri value cua key object
                table.remove(object);
                table.put(object,++n);
            }
        }
        Enumeration keys = table.keys();
        Enumeration values = table.elements();

        System.out.println("Cac tu co so lan xuat hien:");
        while (keys.hasMoreElements()) {
            System.out.println(values.nextElement()+ " : " +keys.nextElement()  );
        }
    }
}
