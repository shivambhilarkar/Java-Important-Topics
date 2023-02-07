package Tutorial;

public class StringBasics {


    public static void main(String[] args) {



        String str1 = "shivam";
        String str2 = "shivam";

        System.out.println(str1 == str2 ? true : false);
        System.out.println(str1.equals(str2) ? true : false);


        System.out.println("--------------------------------------------------");

        String str3 = new String("shivam");
        String str4 = new String("shivam");

        System.out.println(str3 == str4 ? true : false);
        System.out.println(str3.equals(str4) ? true : false);

    }


}
