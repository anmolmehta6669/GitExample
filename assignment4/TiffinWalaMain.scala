package com.knoldus.interns.assignment4

import java.util.Scanner


/**
  * Created by knoldus on 18/1/17.
  */
object TiffinWalaMain {
def main(agrs:Array[String]): Unit ={
  val sc = new Scanner(System.in)
  println("Enter amount to be paid")
  val amount=sc.nextLine().toDouble
  println("Enter Payment method")

  val paymentMethod = sc.nextLine()

  //create an object of TiffinWala
  val tiffinWala = new TiffinWala()
  val actualAmount = tiffinWala.calculate(amount, paymentMethod)
  actualAmount match{
    case -1 => println("Incorrect payment method")
    case _ =>  println(s"Final amount to be paid: $actualAmount")
  }
}
}
