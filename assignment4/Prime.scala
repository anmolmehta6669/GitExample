object Prime{
	def main(args: Array[String]): Unit={
	val list=List(1,2,3,4,5)
	for(x <- list) primeFunction(x)	
	}

		def primeFunction(value:Int):Unit={
		var flag=true
		for(i<- 2 to (value/2) if(flag)){
			if(value%i==0)flag=false 		
			}	
		if(flag)
		println(value)
		}
}

