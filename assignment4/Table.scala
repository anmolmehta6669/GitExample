object LastElement{
def main(args: Array[String]):Unit={
val list=List(1,2,3,4,5)
list.map(x=>table(x)) 
}

def table(x:Int)={
for(i<- 1 to 10) print(s"--${x*i}--")
println("")
}
}
