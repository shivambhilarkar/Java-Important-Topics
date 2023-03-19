static void main(String[] args) {
    println "Hello world!"
    println('-----------------------')

    /**
     input - same as the java
     */
    Scanner scan = new Scanner(System.in);

    /**
     * Data Types - groovy supports data types in java.
     * but groovy is dynamicaly type language so it has datatype name 'def'.
     * which store the all type of data. int, char, string in one.
     */
    def number = 100;
    def first_name = 'shivam'
    def firstLetter = 's'

    /**
     * conditional statements - if else same as the java.
     */
    def flag = true
    if(flag){
        println("True")
    }else{
        println("False")
    }
    //short-hand
    (flag) ? println('True') : println('False')

    /**
     * for loop , while loop same as the java
     * 1. ' ' --> used for string
     * 2. " " --> used for string but we can use ${ var_name} inside string
     */
    for(def i = 0; i < 10; i++){
        print( " ${i} ->" )
    }
    println()

    def counter = 10
    while(counter-- > 0){
        print(" ${counter} -> ")
    }
    println()


    /**
     * Range -> start..end
     */
    /**
     def aToz = 'a'..'z'
     def AtoZ = 'A'..'Z'
     def zToa = 'z'..'a'
     def tenToone = 10..1
     */
    def oneToten = 1..10
    for(num in oneToten){
        print(" ${num} -> ")
    }
    println()


    /**
     * Collection - we can also use java collection here.
     * List - []
     * Map  - [:]
     *
     */

    /**
     * List
     */
    def numList = []
    for(num in 1..10){
        numList.add(num);
    }
    println("[ List : ${numList}]")


    /**
     * set
     * TODO how to create set in groovy
     */
    def numList2 = [1,1,2,2,3,4,5,5,6,6,7,8]
    println("[ List : ${numList2}")

    def set2 = new HashSet() //using java collection
    for(num in numList2){
        set2.add(num)
    }
    println(set2)

    /**
     * Map
     */
    def nameMap = [:]
    nameMap.put('shivam', 'bhilarkar')
    nameMap.put('anas' , 'patni')
    nameMap.put('randy', 'orton')
    println("[ Map in groovy -> ${nameMap} ]")


    /**
     * Methods / functions
     */
    def total = getSum(10, 20);
    println("Total : ${total}")
}

static def getSum(a, b){
    return a + b
}

