import java.util.*;
import  java.util.Comparator;
public class countryList {
    protected static ArrayList<Country> list;
    private final static Scanner in = new Scanner(System.in);


    //tao ra menu
    public static int menu(){
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input double limit
    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static void inputCountry(ArrayList<Country> lc) {
            System.out.print("Enter code of contry: ");
            String countryCode = checkInputString();
            //check code contry exist or not
            if (!checkCountryExist(lc, countryCode)) {
                System.err.println("Country exist.");
                return;
            }
            System.out.print("Enter name of contry: ");
            String countryName = checkInputString();
            System.out.print("Enter total area: ");
            double countryArea = checkInputDouble();
            System.out.print("Enter terrain of contry: ");
            String countryTerrain = checkInputString();
            System.err.println("Add successful.");
            lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));

        }

        //display infomation of country
        public static void printCountry(ArrayList<Country> lc) {
            System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                    "Terrain");
            for (Country country : lc) {
                country.display();
            }
        }

        //display infomation sort name in ascending
        public static void printCountrySorted(ArrayList<Country> lc) {
            Collections.sort(lc);
            System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                    "Terrain");
            for (Country country : lc) {
                country.display();
            }
        }

        //allow user search infomation contry by name
        public static void searchByName(ArrayList<Country> lc) {
            System.out.print("Enter the name you want to search for: ");
            String countryName = checkInputString();
            System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                    "Terrain");
            for (Country country : lc) {
                if (country.getCountryName().equalsIgnoreCase(countryName)) {
                    country.display();
                }
            }
        }

    //check country exist by code
    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }

}

















 // Thuc ra cha khac mia j nhau no chi viet may cai kia them vao day lun thui
  // Nếu viết theo kiểu tạo một list thi sẽ khó truy cập và viết các phương thức hơn là viết ra một lọat các method cho list dễ kiểm soát và viết hàm check lỗi hơn
    /*protected ArrayList<Country> list;
    public countryList() {
       list = new ArrayList<>();
    }
    public void addCountry(Country country){ // ham kiem tra ten co trung hay khong dong thoi add ten country vao list
        boolean flag = true;
       

        for (int i = 0; i < list.size(); i++) {
            Country c = (Country)list.get(i);
            if(c.name.equals(country.getName()) || c.code.equals(country.getCode())){
               flag =false;
               if(c.name.equals(country.getName())== true && c.code.equals(country.getCode())==false)
                   System.out.println("Ten nuoc da co trong danh sach");
               else{
                   if (c.code.equals(country.getCode())== true && c.name.equals(country.getName())== false)
                       System.out.println("Ten code da co trong danh sach");
                   else System.out.println("Code va ten nuoc da co trong danh sach");
               }
            }
        }
        if(flag == true){
            list.add(country);
        }
    }

    public  void showList(){
        Collections.sort(list, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (int i = 0; i < list.size(); i++) {
            Country country =(Country) list.get(i);
            country.show();
        }
    }
    public void showItems(){
        int m = list.size()-1;
        for (int i = 0; i < list.size(); i++) {
            if(i == m)
            {
                Country country =(Country) list.get(i);
                country.show();
            }
        }
    }
    public void find(String name){
        boolean flag  =false;
        for (int i = 0; i < list.size(); i++) {
            Country country =(Country)list.get(i);
            if(country.getName().equals(name)){
                country.show();
                flag =true;
            }
        }
        if(flag == false){
            System.out.println("Cannot find the name "+name+" in our data");
        }
    }
}*/
