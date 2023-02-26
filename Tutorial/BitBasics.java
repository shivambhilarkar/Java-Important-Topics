package Tutorial;

import java.util.Scanner;

public class BitBasics {
    private static void checkIthBitSet(int number , int ith){
        int mask = 1 << ith;
        if((number & mask) == 0){
            System.out.println("[ Bit Not Set ]");
        }else{
            System.out.println("[ Bit is Set ]");
        }


    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /**
         * Negation = (~)
         */
        int number = 10;
        System.out.println("[ Number "+ number + " Negation : "+ (~number) +" ]");


        int number1 = 517;
        System.out.println("[ Num "+ number1 +" = "+Integer.toBinaryString(number1) +" ]");

        int shiftCount = 5;
        System.out.println("[ Shift count ]" + shiftCount);

        /**
         * Right Shift -> add zero in left side of number
         */
        int rightShift = 517 >> 5;
        System.out.println("[ Right Shift : "+rightShift + " = "+Integer.toBinaryString(rightShift));

        /**
         * Left Shift -> add zero in right side of number
         */
        int leftShift = 517 << 5;
        System.out.println("[ Left Shift : "+leftShift + " = "+Integer.toBinaryString(leftShift));

        /**
         * Unsigned Right shift
         * IMPORTANT -> there is no unsigned-left shift.
         */
        int rightShift2 = 517 >>> 5;
        System.out.println("[ UnSigned Right Shift : "+ rightShift2 + " = "+ Integer.toBinaryString(rightShift2));


        /**
         * How to check ith bit is set or not
         */
        int number2 = 517;
        int ith = 3;
        System.out.println("[ Number : "+ number2 + " -> "+Integer.toBinaryString(number2));
        checkIthBitSet(number2, ith);


        /**
         *
         */


    }
}
