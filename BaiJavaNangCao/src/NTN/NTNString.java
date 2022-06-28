package NTN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NTNString {
    String dayMonthYear;

    public NTNString(String dayMonthYear) {
        this.dayMonthYear = dayMonthYear;
    }

    public  NTNString(){

    }
    public static String getDay(String dayMonthYear) {
        String date;
        String day = dayMonthYear.substring(0,1);
        if(day.equals("0")){
            date = dayMonthYear.substring(1,2);
        }
        else{
            date = dayMonthYear.substring(0,2);
        }
        return date;
    }



    public static String getMonth(String dayMonthYear) {
        String date;
        String month = dayMonthYear.substring(2,3);
        if(month.equals("0")){
            date = dayMonthYear.substring(3,4);
        }
        else{
            date = dayMonthYear.substring(2,4);
        }
        return date;
    }


    public static  String getYear(String dayMonthYear) {

        String year = dayMonthYear.substring(4,8);
        return year;
    }


    public String getDayOfYear(String dayMonthYear){
        int dayOfYear = 0;
        int year = Integer.parseInt(getYear(dayMonthYear));
        if(year %4 ==0 || year % 400 ==0){
            dayOfYear = 366;
        }
        else{
            dayOfYear = 365;
        }
        String DayOfYear = String .valueOf(dayOfYear);
        return DayOfYear;
    }



    public String getDayOfMonth(String dayMonthYear){
        String dayOfMonth ="";
        String year = getYear(dayMonthYear);
        String month = getMonth(dayMonthYear);

        if( Integer.parseInt(getDayOfYear(dayMonthYear)) == 366){
            if(month.equals("1") || month.equals("3") || month.equals("5") || month.equals("7") ||month.equals("8")||month.equals("10")|| month.equals("12") ){
                dayOfMonth = "31";
            }
            if(month.equals("2")){
                dayOfMonth = "29";
            }
            if(month.equals("4") || month.equals("6") || month.equals("9")|| month.equals("11")){
                dayOfMonth = "30";
            }
        }
        if( Integer.parseInt(getDayOfYear(dayMonthYear)) == 365){
            if(month.equals("1") || month.equals("3") || month.equals("5") || month.equals("7") ||month.equals("8")||month.equals("10")|| month.equals("12") ){
                dayOfMonth = "31";
            }
            if(month.equals("2")){
                dayOfMonth = "28";
            }
            if(month.equals("4") || month.equals("6") || month.equals("9")|| month.equals("11")){
                dayOfMonth = "30";
            }
        }
        return dayOfMonth;
    }


    public static void main(String[] args) throws ParseException {
        String date ="09/01/2001";
        Date date1 = convertStringToDate(date);
        System.out.println(date1+" "+date);
        String day ="09/02/2001";
        Date day1 = convertStringToDate(day);
        System.out.println(day1+" "+day);

    }
    public static Date convertStringToDate(String date) throws ParseException {

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = formatter1.parse(date);
        return date1;
    }
}
