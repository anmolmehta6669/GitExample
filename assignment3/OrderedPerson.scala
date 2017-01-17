package com.knoldus.interns.assignment3

/**
  * Question on Ordered trait:
Define a class named Person and mix it with Ordered Trait to do the comparison.
First check if the name parameter of both object is equal. If yes, then do the comparison according to age.
If name is not equal then do the comparison based on name length.
class Person(val name: String, val age: Int) extends Ordered[Person]{
}
  */
object OrderedPerson {
  def main(args: Array[String]): Unit =
  {
    val person1= new Person("Anmol", 23)
    val person2= new Person("Pankhurie", 24)
    val person3 = new Person("Anmol", 21)

   println(s"${person1.name} (${person1.age}) is less than ${person2.name} (${person2.age}): ${person1<person2}")
   println(s"${person2.name} (${person2.age}) is less than ${person3.name} (${person3.age}): ${person2<person3}")
   println(s"${person3.name} (${person3.age}) is less than ${person1.name} (${person1.age}): ${person3<person1}")
  }


}
