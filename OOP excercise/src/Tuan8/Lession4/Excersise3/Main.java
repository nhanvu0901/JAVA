package Tuan8.Lession4.Excersise3;

public class Main {
    public String addString(String string1,String string2,String string3){
        String s = string1 + string2+ string3;
        return s;
    }
    public StringBuffer addStringBuffer(StringBuffer string1,StringBuffer string2,StringBuffer string3){
        StringBuffer s = string1.append(string2.append(string3));
        return s;
    }
    public static void main(String[] args) {
        Main ob1 = new Main();
        long start1 = System.nanoTime();
        String s =  ob1.addString("123","456","789");
        long end1 = System.nanoTime();
        System.out.println("Thoi gian : "+ (end1-start1));
        System.out.println(s);
        System.out.println();
        StringBuffer stringBuffer1 = new StringBuffer("123");
        StringBuffer stringBuffer2 = new StringBuffer("456");
        StringBuffer stringBuffer3 = new StringBuffer("789");

        long start2 = System.nanoTime();
        StringBuffer s1 =  ob1.addStringBuffer(stringBuffer1,stringBuffer2,stringBuffer3);
        long end2 = System.nanoTime();
        System.out.println("Thoi gian : "+ (end2-start2));
        System.out.println(s1);

    }
}
