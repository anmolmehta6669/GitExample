package com.knoldus.interns.assignment3

/**
  * Person class containing value class parameters (FirstName, LastName, Age)
  */
class Person(val name:String, val age: Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if (this.name == that.name) //if name is same
      this.age - that.age //then comparison based on ages
    else
      this.name.length-that.name.length //else based on length of names
  }

}
