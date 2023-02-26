![kotlin](https://slackmojis.com/emojis/2351-kotlin/download)
## Kotlin collection ![]( )

- Mutable collection
- Immutable collection

#### Immutable collection
```
List -  listOf()
        listOf<T>()

Map - mapOf()

Set - setOf()
```

#### Mutable collection
```
List - ArrayList<T>()
     - arrayListOf()
     - mutableListOf()

Map  - HashMap
     - hashMapOf()
     - mutableMapOf()

Set  - hashSetOf()
     - mutableSetOf()
```

##### Priority Queue
```
//Highest Priority Queue
  val employeesIds = PriorityQueue<Int> {
   a, b -> b - a
 }
```


##### Queue
- ###### Important 
    Queue is just an interface, so we need a concrete implementation.
    LinkedList class implements the Queue interface => we can use it as a Queue.
    ```
    - val nums: Queue<Int> = LinkedList<Int>()
    - var stack = ArrayDeque<Int>()
    ```


##### Stack 
```
    - val stack = Stack<Int>()
    - var stack = ArrayDeque<Int>()
```




