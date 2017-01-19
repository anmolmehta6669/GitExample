package com.knoldus.interns.assignment4


object Aggregate{

def main(args:Array[String]):Unit={
	val list1= List(1,2,3,4,5)
	val list2=List('a','b','c','d','e')
	var list3=List((list1(0),list2(0)))
	for(i<- 1 to list1.length-1) list3=list3:::List((list1(i),list2(i)))
	list3.map(println _)
	}


//	def aggregate()

}
