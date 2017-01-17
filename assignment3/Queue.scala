package com.knoldus.interns.assignment3

/**
  * Created by knoldus on 17/1/17.
  */
trait Queue {
 var list= List[Int]()


//  def enqueue(item: Int): Unit
 def enqueue(value:Int):Unit

  def dequeue():Int={
    val deleted = list(0)
    list=list.drop(1)
    deleted
  }

  def printQueue(): Unit ={
    list.map(println(_))
  }

}
