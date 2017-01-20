package com.knoldus.interns.assignment4

object Factorial {
  def fact(n: Int): Int = {


    def innerFact(n: Int, fact: Int): Int = { //5,1 4,5 3, 20 2 , 60 1 , 120
      n match {


        case 1 => fact
        case _ => innerFact(n - 1, fact * n)
      }
    }
    innerFact(n, 1)
  }

  def main(args: Array[String]): Unit = {

    println(fact(0))
  }
}
