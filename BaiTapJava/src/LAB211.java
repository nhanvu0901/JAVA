import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class LAB211 {
    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();// tao ra mot cai list o ngay trang nay va nhap vao cai list nay
        //loop until user want to exist
        while (true) {
            int choice = countryList.menu();
            switch (choice) {
                case 1:
                    countryList.inputCountry(lc);
                    break;
                case 2:
                    countryList.printCountry(lc);
                    break;
                case 3:
                    countryList.searchByName(lc);
                    break;
                case 4:
                    countryList.printCountrySorted(lc);
                    break;
                case 5:
                    return;
            }
        }
    }
}
