object SumOfList extends App{
val list1= List(10,20,30)
val list2= List(40,50,70)
val list = for(i<- list1.indices) yield list1(i)+list2(i) //for comprehension for calculating sum of elements of the two lists
list.map(println(_)) //printing the list with map and placeholder
}
