package NTN;


import static NTN.NTN.plusOneDay;

public class Entry {
    public static void main(String[] args) {
        NTN date1 = new NTN(31,1,2001);
        plusOneDay(date1);
        date1.toString();
        System.out.println(date1);
        NTN date2 = new NTN(15,8,2021);
        int m = date1.countDayDifferent(date2);
        System.out.println(m);



    }
}
