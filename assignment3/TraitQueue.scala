package com.knoldus.interns.assignment3

/**
  * Question on Trait and packages:
Make a trait Queue which performs two functions of enqueue and dequque.
Two classes: DoubleQueue and SquareQueue mix in this trait.
You may use List for the implementation and keep both the classes in the same file with proper packaging.

DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
dequeue method will remove the first element from the queue(having concrete definition in trait Queue).

  */
object TraitQueue {
  def main(args:Array[String]): Unit ={
    val doubleQueue = new DoubleQueue
    val squareQueue = new SquareQueue



    doubleQueue.enqueue(1)
    doubleQueue.enqueue(2)
    doubleQueue.enqueue(3)
    doubleQueue.enqueue(4)
    doubleQueue.enqueue(5)

    println(s"After adding 1-5 in doubleQueue: ")
    doubleQueue.printQueue()


    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    squareQueue.enqueue(5)

    println(s"After adding 1-5 in squareQueue: ")
    squareQueue.printQueue()

  }
}
