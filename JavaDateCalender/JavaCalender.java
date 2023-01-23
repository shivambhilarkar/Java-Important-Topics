package JavaDateCalender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaCalender {

    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();

        System.out.println("[ calendar : "+ calendar  + " ]");
        System.out.println("[ Time : "+ calendar.getTime() + " ]");
        System.out.println("[ Calendar Type : "+ calendar.getCalendarType() + " ]");


        //--------------- Date methods in Calender

        System.out.println("[ Date : "+ calendar.get(calendar.DAY_OF_MONTH) + " ]");
        System.out.println("[ Day : "+ calendar.get(calendar.DAY_OF_WEEK) + " ]");
        System.out.println("[ Hours : "+ calendar.get(calendar.HOUR_OF_DAY) + " ]");
        System.out.println("[ Minutes : "+ calendar.get(calendar.MINUTE) +" ]");
        System.out.println("[ Year : "+ calendar.get(calendar.YEAR) + " ]");

    }
}
