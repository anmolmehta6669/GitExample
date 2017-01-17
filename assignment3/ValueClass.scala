package com.knoldus.interns.assignment3

/**
  * Question on Value Class:
Define three Value classes namely: FirstName, LastName and Age
Define a method like - displayDetails which may take these three value classes as inputs and returns a string as:
Output: Prashant Goel is of 24 years.
  */
object ValueClass {
  def displayDetails(fName: FirstName,lName:LastName,age:Age): String ={
    s"$fName $lName is of $age years."
  }

def main(args: Array[String]): Unit ={
  val fName=new FirstName("Anmol")
  val lName=new LastName("Mehts")
  val age=new Age(23)
  val details=displayDetails(fName,lName,age)
  println(details)
}
}
