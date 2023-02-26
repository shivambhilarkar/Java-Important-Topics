![kotlin](https://slackmojis.com/emojis/2351-kotlin/download)
# Kotlin Basics

###  GETTING INPUT FROM THE USER

```
import java.util.Scanner

fun main(args: Array<String>) {

    // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
}
```

### MAIN FUNCTION
```
fun main(){
    println("Hello world")
    print("Printing on the same line")
}
```

### COMMENT
```
// single line comment 

/*
* multi line comment 
* same as the java.
*/
```

## VARIABLES

##### To create a variable use "var" or "val", and assign a value to with equal sign(=)

```
var variableName = value;   -> can be changed / modified
val variableName = value;   -> can't be changed   --> work like final 
```

##### IMPORTANT : when you assign value and then letter you intilaized that time you should define the type of variable.

```
var name : String
name = "shivam"
println(name)
```


##### without type
```
var name = "John"      // String (text)
val birthyear = 1975   // Int (number)
```

##### type specific
```
var name: String = "John" // String
val birthyear: Int = 1975 // Int
```

### DATA TYPES
```
val myNum = 5             // Int
val myDoubleNum = 5.99    // Double
val myLetter = 'D'        // Char
val myBoolean = true      // Boolean
val myText = "Hello"      // String


val myNum: Int = 5                // Int
val myDoubleNum: Double = 5.99    // Double
val myLetter: Char = 'D'          // Char
val myBoolean: Boolean = true     // Boolean
val myText: String = "Hello"      // String
```


### OPERATORS
Operator are same as in Java.
   - 1. Arithmatic Operators.
   - 2. Assighment Operators.
   - 3. Comparison Operators.
   - 4. Logical Operators.


### STRINGS
- --string methods are same as the java.
- --you can access the character using str[0] , str[1]
- --length of string - str.length


### BOOLEANS
--same as the java.

### IF ELSE statements
```
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```

##### TERNARY EXPRESSION 
```  
if (time < 18) "Good day." else "Good evening."
```

### WHEN conditional statements
--this is same as switch statment in java.
```
val day = 4

val result = when (day) {
  1 -> "Monday"
  2 -> "Tuesday"
  3 -> "Wednesday"
  4 -> "Thursday"
  5 -> "Friday"
  6 -> "Saturday"
  7 -> "Sunday"
  else -> "Invalid day."
}
println(result)
```

### WHILE LOOP
```
while (condition) {
  // code block to be executed
}
```
#### DO WHILE LOOP
```
do {
  // code block to be executed
}
while (condition);
```
##### BREAK AND CONTINUE
- BREAK -> The break statement is used to jump out of a loop.
- CONTINUE -> continue statement will skips one interation. -> current iteration will be skip


### ARRAYS.
- To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
    ```
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    ```

- we are simply initialize an array of size 5 with default value as 0. 
    ```
    var myArray = Array<Int>(5){0}  
    ```

### FOR LOOP
-- there is no tradition loop in kotlin for(int i = 0; i , 10; i++) like this.
```
for each loop -
    for(day in days){
        println(day)
    }
```
### RANGES

with the for loop, you can also create ranges of values with ".."
```
exampe 1 :
    for(chars in 'a'..'z')
        println(chars)
    }


example 2 :    
    for(num in 1..10){
        println(num)
    }
```

IMPORTANT - 'in' variable is also used to check if element is present in array or not.
```
val nums = arrayOf(1,2,3,4,5,6,7,8,9,10)

if(2 in nums){
    println("It exists!")
}else{
    println("Doesn't exists")
}
```

### FUNCTIONS
```
fun myFunction(){
    println("this is function or method in kotlin")
}

myFunction() //call myFunction
```
##### Parameterized funtion
```
fun sumOftwo(firstOne: Int , secondOne: Int){
    println(firstOne + secondOne)
}
```

##### IMPORTANT --> you should specify the type of the parameters in functions / methods.
```
fun sumOfTwo(firstOne: Int, secondOne: Int){
    return firstOne + secondOne
}
```

##### IMPORTANT -> we don't have to give specific return type in function defination / methods.











