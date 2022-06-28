package NTN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NTN {
    private int day;
    private int month;
    private int year;

    public NTN(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDayOfYear(int year){
        int dayOfYear;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    dayOfYear = 366;
                } else {
                    dayOfYear = 365;
                }
            } else {
                dayOfYear = 366;
            }
        }
        else {
            dayOfYear = 365;
        }
        return dayOfYear;
    }

    public int getDaysOfMonth(int month, int year){
        int dayOfYear = getDayOfYear(year);
        int dayOfMonth = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayOfMonth = 31;
                break;
            case 2:
                if(dayOfYear == 365){
                    dayOfMonth = 28;
                }
                else if(dayOfYear == 366){
                    dayOfMonth = 29;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            default:
                break;
        }
        return dayOfMonth;
    }

    public static NTN plusOneDay(NTN ntn){


        int dayOfMonth = ntn.getDaysOfMonth(ntn.getMonth(),ntn.getYear());
        ntn.setDay(ntn.getDay() + 1);
        if(ntn.getDay() > dayOfMonth){
            ntn.setDay(1);
            ntn.setMonth(ntn.getMonth() + 1);
            if(ntn.getMonth() > 12){
                ntn.setMonth(1);
                ntn.setYear(ntn.getYear() + 1);
            }
        }
        return ntn;
    }
   public int countDayDifferent(NTN date){
       NTN ntn = new NTN(getDay(),getMonth(),getYear());
       int count =0;

           while(ntn.year - date.year !=0){
               if(ntn.year > date.year){
                   plusOneDay(date);
                   count++;
               }
               else{
                   plusOneDay(ntn);
                   count++;
               }
           }


           while(ntn.month - date.month !=0){
               if(ntn.month > date.month){
                   plusOneDay(date);
                   count++;
               }
               else{
                   plusOneDay(ntn);
                   count++;
               }
           }


           while(ntn.day - date.day !=0){
               if(ntn.day > date.day){
                   plusOneDay(date);
                   count++;
               }
               else{
                   plusOneDay(ntn);
                   count++;
               }
           }

       return count;
   }
    public static NTN minusOneDay(NTN ntn){

        ntn.setDay(ntn.getDay() - 1);
        if(ntn.getDay() < 1){
            ntn.setMonth(ntn.getMonth() - 1);
            int dayOfMonth = ntn.getDaysOfMonth(ntn.getMonth(), ntn.getYear());
            ntn.setDay(dayOfMonth);
            if(ntn.getMonth() < 1){
                ntn.setYear(ntn.getYear() - 1);
                ntn.setMonth(12);
                dayOfMonth = ntn.getDaysOfMonth(ntn.getMonth(),ntn.getYear());
                ntn.setDay(dayOfMonth);
            }
        }
        return ntn;
    }


    @Override
    public String toString() {
        return this.day + " / " + this.month + " / " + this.year;
    }


    public static Date convertStringToDate(String date) throws ParseException {

        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = formatter1.parse(date);
        return date1;
    }

}
