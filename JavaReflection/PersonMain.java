package JavaReflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PersonMain {


    public static void main(String[] args) throws Exception {

        Person person1 = new Person("shivam", "bhilarkar", 23, 96570237 );

        System.out.println(person1);

//        person1.setAge(24); //Throws error private method can't access


        /**
         * To get all the variables / Fields from class
         */

        Field[] personFields = person1.getClass().getDeclaredFields(); //array of fields.
        System.out.println( "[ Person Fields : "  + Arrays.toString(personFields) + " ]");

        /**
         * To get all the methods of class
         */
        Method[] personMethods = person1.getClass().getDeclaredMethods();
        System.out.println( "[ Person Methods : " + Arrays.toString(personMethods) + " ]");


        /**
         * Change the value of private variables of class.
         */
        System.out.println("[ Changing private fields. ]");
        System.out.println("[ Person Before : "+ person1 + " ]");
        for(Field field : personFields){
            if(field.getName().equals("age")){
                field.setAccessible(true);
                field.set(person1 , 25);
            }
        }
        System.out.println("[ Person After : "+ person1 + " ]");

        /**
         * Invoke the private method of class
         */
        System.out.println("[ Invoking the private method. ]");
        System.out.println("[ Person Before "+ person1 + " ]");
        for(Method method : personMethods){
            if(method.getName().equals("setFirstName")){
                method.setAccessible(true);
                method.invoke(person1 , "Anas");
            }

            if(method.getName().equals(("setAge"))){
                method.setAccessible(true);
                method.invoke(person1, 23);
            }
        }
        System.out.println("[ Person After : "+ person1 + " ]");

    }

}
