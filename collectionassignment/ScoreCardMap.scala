import listassignments.{Student, Marks}

//case class ScoreCard(studentId: Long, marks: Map[Long, Float], percentage: Float)

case class ScoreCard(studentId: Long, marks: Map[Long, Float], percentage: Float)


object ScoreCardMap extends App{
  val studentList: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"), Student(3, "Shubhra"), Student(4, "Shivangi"), Student(5,"Mahesh"), Student(6, "Anmol"))

  val marksList: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) ,
    Marks(1, 6, 34), Marks(2, 6, 29), Marks(3, 6, 92), Marks(4, 6, 20), Marks(5, 6, 19))

  val reportCard=reportCardGenerator()
//  reportCard.map(println _)
println(reportCard)
 /* def reportCardGenerator():Unit = {
    val tempPair1 = marksList.groupBy(x => x.studentId) //Key value pair having studentId as key & list of list of MarksCase as value

    val tempList1 = tempPair1.map(x => (x._1, x._2.map(y => y.marksObtained))).toList // Creating a list having tuples of total marks with associated studentID
    val subjectIdList: List[Long] = marksList.map(x => x.subjectId) //list of subject ids
//    val mapOfMarks[: Map[Long, Float] =
     studentList

//print(mapOfMarks)
    //subjectId.map(x=> marksList.flatMap(if(subjectId==marksList)marksList.))

//    val map=Map[Long,Float]((n,m))
//    println(s"tempPair1 : $tempPair1")
//    println(s"tempList1 : $tempList1")


//    println(result.toMap)
//    println(s"grouped: ${result.groupBy(x=> x._1)}")
//    println(result.groupBy(x=> x._1).toMap)

//    result.groupBy(x=>x._1)


  }*/

//  def reportCardGenerator():Map[String,AnyRef] = {
def reportCardGenerator():Unit= {
    val tempPair1 = marksList.groupBy(x => x.studentId) //Key value pair having studentId as key & list of list of MarksCase as value
    val tempList1 = tempPair1.map(x => (x._1, x._2.map(y => y.marksObtained))).toList // Creating a list having tuples of total marks with associated studentID
    println(s"tempPair1 : $tempPair1")
    println(s"tempList1 : $tempList1")

    val m:Float = 1212
    val (l1,l2) = (studentList.map(y=> (marksList.map(x=> if( x.studentId==y.id) (x.subjectId,x.marksObtained) ))))
  ///val tryMap = for(i<-studentList)
  //yield marksList.map(x=>if(x.studentId==i) (i, x.subjectId,x.marksObtained))
//studentList.map()


//    val result = for (x <- tempList1; y <- studentList if (x._1 == y.id)) yield (y.name,new ScoreCard(y.id, Map[Long, Float](5,6), 10)) // combining the names and marks to get a new list of toppers
//    result.toMap
  }
}
