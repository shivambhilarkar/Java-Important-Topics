# Bit Manipulation Basics

- ### AND Table

- ### OR Table

- ### XOR Table

---

- #### Negation  [ ~ ]
  convert 0 to 1 and 1 to 0
    ```
        11101110 -> 0001001

        int number = 5;
        int negation = ~(number)
    ```

- #### Right Shift [ >> ]
  add the zeros to right side of number.
    ```
        shift_count =  3
        1010101 -> 001010
    ```

- #### Left Shift [ << ]
  add the zeros to right side of number.
    ```
        shift_count =  3
        1010101 -> 001010000
    ```

- #### Un-signed Right Shift [ >>> ]
    - add the zeors to right side of number.
    - If number is negative then convert it to positive.
   ```
        shift_count =  3
        1010101 -> 001010
    ```   
- #### IMPORTANT -  There is no concept of un-signed left shift ❌

---

- ##### Check ith bit set or not
    ```
    Q. check 2nd bit is set or not.
    int num = 5
    5 = 101
    1 = 001  -->   001 << 2 --> 00100

    if take and(&) of both numbers.
    and output number is non-zero then ith bit is set.
    else ith bit is not set.
         00101
         00100
        -------
         00100 
    ```

    ```
        int num = 5;
        int ith_bit = 2;
        if((num << ith_bit) != 0){
            System.out.println("[ Bit is Set ]");
        }else{
            System.out.println("[ Bit Not Set]");
        }
    ```

- #### Set ith Bit
    - convert ith bit from 0 to 1
    ```
        int ith = 2;
        10001000  -> 10001100

        10001100
      or
        00001000
       ----------
        10001100  
    ```

    ```
        int num = 517;
        int ith_bit = 2;

       ===>  ( num | ( 1 << ith_bit ))
    ```

- #### UnSet ith Bit
    - convert ith bit from 1 to 0
    ```
        int ith = 3;
        10001100  -> 10001000

        10001100            
      &
        11110111  -->  00000001 << 3  -> 00001000  -> ~(00001000) -> 111110111   
       ----------
        10000100  
    ```

    ```
        int num = 517;
        int ith_bit = 3;

       ===>  ( num & (~ ( 1 << ith_bit )))
    ```

- #### Toggle
    - Convert ith bit from 1 to 0 or 0 to 1;
    - 0 -> 1  and   1->0
    ```
       ===>  ( num ^ ( 1 << ith_bit))
    ```