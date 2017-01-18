package com.knoldus.interns.assignment4


import java.util.Scanner
import java.util.Stack

/**
  * Created by knoldus on 18/1/17.
  */
object InfixEvaluation {
  def main(args: Array[String]): Unit = {

    var operand = new Stack[Int]()
    var operator = new Stack[Char]()
    val sc = new Scanner(System.in)
    println("Enter the infix expression")
    val expression = sc.nextLine()

    for (i <- 0 to expression.length - 1) {
      //      println("Reading :"+expression.charAt(i))
      expression.charAt(i) match {
        case '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' => operand.push(expression.charAt(i).toInt - 48)
        case '/' | '*' | '-' | '+' => {

          if (operator.empty())
            operator.push(expression.charAt(i))
          else {
            while (!operator.empty() && precedence(expression.charAt(i), operator.peek())) {
              var opr = if (!operator.empty()) operator.pop() else '+'
              var num1 = if (!operand.empty()) operand.pop() else -1
              var num2 = if (!operand.empty()) operand.pop() else -1
              //            println(opr,num1,num2)
              operand.push(calculate(opr, num1, num2))

            }
            operator.push(expression.charAt(i))
          }

          //            println("Reading :"+expression.charAt(i))
        }

        case _ => println("Invalid Expression")
      }
    }
    //evaluate pending expression in stack, already in correct precedence
    //evaluate(operand,operator)
    while (!operator.empty()) {
      var opr = operator.pop()
      var num1 = if (!operand.empty()) operand.pop() else -1
      var num2 = if (!operand.empty()) operand.pop() else -1
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
      case '+' | '-' => {
        opr2 match {
          case '*' | '/' => {
            print("true")
            true
          }
          case _ => {
            print("false")
            false
          }
        }
      }
      case _ => false
    }
  }


}

