package com.knoldus.interns.assignment3

/**
  * Enqueue doubled elements in queue
  */
class DoubleQueue extends Queue{
  override def enqueue(value: Int): Unit ={
    list=list:+(value*2)
  }

}
