package com.knoldus.interns.assignment4


object Prime{
	def main(args: Array[String]): Unit={
		val list=List(1,2,3,4,5)
		list.map(x=>println(primeFunction(x)))
	}

		def primeFunction(value:Int):Boolean={
			def prime(num:Int , divisor: Int): Boolean={
				if(divisor> (num/2)) true
			else if(num%divisor==0) false
			else prime(num,divisor+1)
			}
			prime(value,2)
		}
}

