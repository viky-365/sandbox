package test.spock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by vikrant on 22/01/15.
 */
public class Cal {
    public static void main(String[] args) throws ParseException {


        System.out.println("Day = " + getWeekDayFromDate("01-01-1901"));
    }

    private static String getWeekDayFromDate(final String date) throws ParseException {
        Calendar c = getCalendar(date);
        int noOfYears = c.get(Calendar.YEAR) - 1901;
        int noOfLeapYears = noOfYears / 4;
        int noOfDays = c.get(Calendar.DAY_OF_YEAR);
        //System.out.println(noOfYears + " - " + noOfLeapYears + " - " + noOfDays);
        int day = (2 + noOfYears + noOfLeapYears + noOfDays ) % 7;
        return getWeekDay(day);
    }

    private static String getWeekDay(int day) {
        switch (day){
            case 1 : return "SUNDAY";
            case 2 : return "MONDAY";
            case 3 : return "TUESDAY";
            case 4 : return "WEDNESDAY";
            case 5 : return "THURSDAY";
            case 6 : return "FRIDAY";
            case 7 : return "SATURDAY";
            default: return "--";
        }
    }

    private static Calendar getCalendar(String date) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.setTime(new SimpleDateFormat("dd-MM-yyyy").parse(date));
        System.out.println(c.getTime());
        return c;
    }
}
