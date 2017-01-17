object Fibonacci{
	def main(args: Array[String]){
		val num=1
		//var inp = List(Int)
		val resultList=fibonacci(num)
		resultList map(println(_))
	
	}



def fibonacci(n: Int):List[Int] = {

def innerFibo(n:Int,first:Int,second:Int,list:List[Int]):List[Int] ={ //tail recursion
n match {
case 1=> first::list 
case 2 => second::list
case _ => innerFibo(n-1,second,first+second,second::list)
}
}
n match {
case 1 => 0::List[Int]()
case _ => innerFibo(n,0,1,0::List[Int]()) //Since zero is not being printed according to our logic, it's been appended explicitly
	}
}



}
