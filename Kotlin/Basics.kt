package Kotlin

//class Basics {
//
//}

//function in kotlin
fun sum(num1: Int, num2: Int) {
    return println(num1 + num2)
}

fun joinString(fname: String, lname: String): String {
    return fname + lname;
}

class Person {
    var fname: String = ""
    var lname: String = ""

    override fun toString(): String {
        return fname + " " + lname
    }
}

class Car(var name: String, var model: String) {
    override fun toString(): String {
        return name + model;
    }
}

class Books {
    var lst = listOf<String>("book1", "book2", "book3", "book4", "book5")

    fun getBooks(): List<String> {
        return lst
    }
}


fun main() {
    println("Hello world program is running..")
    /*

        var result = sum(10, 20);
        println(result)
    */
    var fullName = joinString("shivam", "bhilarkar")
//    println(fullName)


    var fname: String
    fname = "shivam"
    val lname: String
    lname = "bhilarkar"
//    lname = "warning" //error not re-assign value
//    println(fname + lname)

    var p1 = Person();
    p1.fname = "Manish"
    p1.lname = "Jadhav"
    println(p1)


    var tiago = Car("TATA ", "Tiago")
    println("[ First Car " + tiago + " ]")

    var thar = Car("Mahindra ", "Thar")
    println("[ Second Car : " + thar + " ]")

    val booklist = Books().getBooks()
    println(booklist)

    for (book in booklist) {
        println("[ Book : " + book + " ]")
    }

    var start = 0;
    var end = 10;
    for (number in start..end) {
        print(" $number -> ")
    }
//    "$num" -> string template you can variabl inside the string using $sign


}