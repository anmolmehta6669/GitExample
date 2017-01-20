package com.knoldus.interns.assignment4


object Aggregate {

  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List('a', 'b', 'c', 'd', 'e')

    val l3 = list1.zip(list2)

    val outList = List[(Int, Char)]()


    val list = l3.map(n1 => n1 :: outList)
    println(list)
  }


}