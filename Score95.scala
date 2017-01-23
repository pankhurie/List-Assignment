/**
  * List Assignment 1
  * problem vi
  * Find the student(s) who have scored 95% or above and print its details.
input: 95%
output:
Kunal 95%
Himanshu 96%
Geetika 97%
  */
object Score95 extends App{
  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"), Student(3, "Shubhra"), Student(4, "Shivangi"), Student(5,"Mahesh"))

  val l2: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) )


  val scorers=scoredAbove(l2,l1,95)
  println(s"Students scoring above 95% are: ")
  scorers.map(println _)


  def scoredAbove(marksList:List[Marks],studentsList:List[Student],percent:Int):List[(String,Int)]={
    val result=calculate(marksList,studentsList)
    result.flatMap(x=> if(x._2>=percent) Some(x) else None)
  }


  def calculate(marksList:List[Marks], studentList:List[Student]):List[(String, Int)]={
    val tempPair1=marksList.groupBy(x=> x.studentId)                  //Key value pair having studentId as key & list of list of MarksCase as value
    val tempList1=tempPair1.map(x=> (x._1,x._2.map(y=>y.marksObtained).sum)).toList // Creating a list having tuples of total marks with associated studentID
    val result=for(x<-tempList1;y<-studentList if(x._1==y.id))yield (y.name,(x._2)/5) // combining the names and marks to get a new list of toppers
    result
  }
}
