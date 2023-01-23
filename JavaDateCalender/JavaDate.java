package JavaDateCalender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {


    public static void main(String[] args) {

        Date date = new Date();

        System.out.println("[ Today : "+ date + " ]");

        System.out.println("[ Day : "+ date.getDay() + " ]");       //int
        System.out.println("[ Month : "+ date.getMonth() + " ]");   //int
        System.out.println("[ Date : "+ date.getDate() + " ]");     //int
        System.out.println("[ Time : " + date.getTime() + " ]");   //long value

        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
        String todayDate = formatter.format(date);
        System.out.println("[ Today's Date : "+ todayDate + " ]");

    }
}
