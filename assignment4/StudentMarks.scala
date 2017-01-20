package com.knoldus.interns.assignment4



/**
  * Created by knoldus on 20/1/17.
  */
object StudentMarks {

  def main(args:Array[String]): Unit ={
    val studentsList= List(StudentCase(1,"Anmol"),StudentCase(2,"Archana"),StudentCase(3,"Saniya"),StudentCase(4,"Babbar"), StudentCase(5,"Dolly"),StudentCase(6,"Jassi"),StudentCase(7,"Shubham"),StudentCase(8,"Anuja"), StudentCase(9,"Prerna"), StudentCase(1,"Karan"))
    val marksList=List(MarksCase(1,1,100) ,MarksCase(1,1,100) ,MarksCase(2,1,90),MarksCase(3,1,80),MarksCase(4,1,60),MarksCase(5,1,100),MarksCase(2,1,100),MarksCase(2,1,90), MarksCase(2,1,80),MarksCase(1,1,67),MarksCase(1,1,70), MarksCase(3,1,100))
    val count1=passCount(marksList,1,90,"pass")
    val count2=passCount(marksList,2,90,"fail")
    println(count1,count2)
  }

  def passCount(marksList:List[MarksCase],id:Int,percent:Int,choice:String): Int = {
    choice match {
      case "pass"=> {
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marks > percent) Some(x) else None)
       count.size
      }
      case "fail"=>{
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marks < percent) Some(x) else None)
        count.size
      }
  }
  }




  def subjectTopBottom(marksList:List[MarksCase], studentsList:List[StudentCase],subjectId: Int, count:Int,choice:String):List[(String,Int)]{

    choice match{
      case "top"=>{
      var output=marksList.map{

  }

  }
   }
  }

  }
