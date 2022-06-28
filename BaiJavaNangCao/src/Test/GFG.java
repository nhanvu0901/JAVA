package Test;

class GFG {
    public static void main(String[] args)
    {

        String [][]LAPTOP_TEST_DATA = {  // ma tran cap 2 hang cot
              //a[0,0] , a[0,1]   .....
                {"Acer", "Aspire VX5-591G", "VX5-591G-62YZ", "2017", "Black", "1", "890", "700", "Intel Core i5 7300HQ", "8", "1000"},
                {"Dell", "Vostro 3500", "V5I3001W", "2020", "Black", "1", "550", "434.4", "Intel Core I5 1035G1", "8", "256"} ,
                {"Acer", "Aspire A315-56-502X", "NX.HS5SV.00F", "2019", "Black", "1", "569.99", "478.2", "Intel Core I5 1035G1", "4", "256"},
                {"Lenovo", "Ideapad Slim 3 ", "14ITL6 82H700DNVN ", "2018", "Grey", "1", "549.9", "456", "Intel Core I3 1115G4", "8", "512"},
                {"MSI", "Modern 14 ", "B10MW-482VN ", "2020", "Blue Stone", "1", "599.99", "443.4", "Intel Core I3 10110U", "8", "256"} ,
                {"HP", "HP 245 G8 ", "345R8PA ", "2019", "Silver", "1", "590", "478", "Ryzen 5 3500U", "4", "256"},
                {"Dell ", "Inspiron 7490 ", "N4I5106W ", "2018", "Silver", "1", "1110", "869.9", "Intel Core I5 10210U", "8", "512"},
                {"Acer", "Swift 3X SF314 510G 5742", "NX.A10SV.003 ", "2020", "Gold", "1", "1109.99", "800", "Intel Core I5 1135G7", "16", "1000"},
                {"LG ", "Gram 14ZD90N ", "V.AX53A5", "2019", "White", "1", "1099.99", "869.5", "Intel Core I5 1035G7", "8", "256"},
                {"LG", "Liber V14 ", "NS14A8VNF561", "2021", "Grey", "1", "749.9", "521.9", "Intel Core I5 10210U", "8", "256"},
                {"Apple", "Macbook Pro", "MYD82", "2020", "Space Gray", "1", "799.9", "500", "Apple M1", "8", "256"}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(LAPTOP_TEST_DATA[i][j] + " ");
            }

            System.out.println();
        }
    }
}