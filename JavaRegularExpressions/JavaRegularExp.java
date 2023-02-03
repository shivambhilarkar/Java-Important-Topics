package JavaRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegularExp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //pattern 4 letter @ and 3 digit
        Pattern pattern = Pattern.compile("^\\w{5}@\\d{3}$");

        //pattern is 10 digit no
        //Pattern pattern = Pattern.compile("^\\d{10}$");

        //username more than 5 length long
        //Pattern pattern =  Pattern.compile("^\\w{5,}$");

        System.out.print("[ Enter Input ] : ");
        String input = scan.next();

        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            System.out.println("[ Pattern is matched ]");
        }else{
            System.out.println("[ Pattern didn't matched ]");
        }
    }
}
