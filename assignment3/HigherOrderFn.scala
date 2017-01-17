package com.knoldus.interns.assignment3

import java.util.Scanner

/**
  * Using higher order functions, implement:
sum of squares
sum of cubes
sum of Ints
def sum(f: (Int, Int) => Int,a: Int, b:Int): Int
  */
object HigherOrderFn {
  def main(args: Array[String]): Unit = {
    //sum of int, sq, cu

    val sc =  new Scanner(System.in)

    println("Enter the type of sum you want: Ints, Squares, Cubes")
    val kindOfSum=sc.nextLine();
    kindOfSum.toLowerCase() match {
      case "ints" =>println(s" Sum of ints: ${sum (3, 4, (x, y) => x + y)}")
      case "squares"=>println(s" Sum of ints: ${sum (3, 4, (x, y) => (x * x) + (y * y)) }")
      case "cubes"=> println(s" Sum of ints: ${sum (3, 4, (x, y) => (x * x * x) + (y * y * y))}" )
      case _ => println("Invalid input")
    }

  }

  def sum(x: Int, y: Int, f:(Int, Int)=> Int): Int = f(x, y)
}