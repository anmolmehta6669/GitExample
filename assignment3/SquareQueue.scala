package com.knoldus.interns.assignment3

/**
  * Enqueue squared elements in queue
  */
class SquareQueue extends Queue{
  override def enqueue(value:Int):Unit={
    list=list:+(value*value)
  }
}
