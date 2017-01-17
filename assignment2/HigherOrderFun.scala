object HigherOrderFun{

	def main(args:Array[String]){ //main method
		if(!(args.length<3)){
			val shape = args(0)
			val length = args(1).toInt
			val width = args(2).toInt
			shape match {
				case "rectangle" => println(area("rectangle",length,width,((x, y)=>x*y)))
				case "rhombus" => println(area("rhombus",length,width,((x, y)=>x*y)))
				case "parellelogram" => println(area("parellelogram",length,width,((x, y)=>(x*y)/2)))
				case _ => println(s"Not defined yet for $shape")
			}
		
		}else{
			println("Arguments insufficient.")
		}
	}

	def area(shape:String, a:Int, b:Int,f:(Int,Int)=>Int):String=s"Area of $shape is ${f(a,b)}" //higher order function to calculate area depending on the shape
}


