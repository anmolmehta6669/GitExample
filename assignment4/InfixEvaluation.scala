package com.knoldus.interns.assignment4


import java.util.Scanner
import scala.collection.mutable.Stack
/**
  * Created by knoldus on 18/1/17.
  */
object InfixEvaluation {
  def main(args: Array[String]): Unit = {

    val operand = new Stack[Int]()
    val operator = new Stack[Char]()
    val sc = new Scanner(System.in)
    println("Enter the infix expression")
    val expression = sc.nextLine()

    expression.map {i=>
      expression.charAt(i) match {
        case '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' => operand.push(expression.charAt(i).toInt - 48)
        case '/' | '*' | '-' | '+' => {

          if (operator.isEmpty)
            operator.push(expression.charAt(i))
          else {
            operator.map{ oprtr=>
              if(precedence(expression.charAt(i), oprtr)){
              val opr = operator.pop()
              val num1 = if (!operand.isEmpty)operand.pop() else -1
              val num2 = if (!operand.isEmpty) operand.pop() else -1
              operand.push(calculate(opr, num1, num2))
              }
            }
            operator.push(expression.charAt(i))
          }

        }

        case _ => println("Invalid Expression")
      }
    }
    operator.map { opr=>
      val opr = operator.pop()
      val num1 = if (!operand.isEmpty) operand.pop() else -1
      val num2 = if (!operand.isEmpty) operand.pop() else -1
      //                    println(opr,num1,num2)
      operand.push(calculate(opr, num1, num2))
    }
    println(s"the result is ${operand.pop()}")
  }

  def calculate(opr: Char, num2: Int, num1: Int): Int = {
    opr match {
      case '+' => num1 + num2
      case '-' => num1 - num2
      case '/' => num1 / num2
      case '*' => num1 * num2
      case _ => -1
    }
  }

  def precedence(opr1: Char, opr2: Char): Boolean = {
    opr1 match {
      case '+' | '-' =>
        opr2 match {
          case '*' | '/' => true
          case _ => false
        }
      case _ => false
    }
  }


}

