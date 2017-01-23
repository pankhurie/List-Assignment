/**
  * List Assignment 1:
  * Problem ii: Input:- (subjectId, count, top/bottom)
Output:- based on the last input(top/bottom), output the students details who have scored max/min in that subjectId
e.g.
input: 1 5 top
output:
Kunal 85
Himanshu 84
Geetika 83
Anmol 82
Mahesh 81
  */

object TopBottom extends App {

  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"), Student(3, "Shubhra"), Student(4, "Shivangi"), Student(5,"Mahesh"))

  val l2: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) )

  println(topBottom(l2, l1,3, 3, "top"))

  def topBottom(marksList:List[Marks],studentList:List[Student],subId:Int,count:Int,choice:String): List[(String, Int)]={
    val topBottomMarks = choice match {
      case "bottom"=> l2.sortWith(_.marksObtained<_.marksObtained)
        .sortWith(_.subjectId<_.subjectId).takeWhile(_.subjectId<=subId)
        .dropWhile(_.subjectId<subId).take(count)
      case "top"=> l2.sortWith(_.marksObtained>_.marksObtained).sortWith(_.subjectId>_.subjectId).takeWhile(_.subjectId>=subId).dropWhile(_.subjectId>subId).take(count)
    } //sorting according to top or bottom requirement and getting first $count elements of the list
    //To extract student names
    val topStudents = topBottomMarks.flatMap (y =>l1.flatMap(x=> if (y.studentId==(x.id)) Some(x) else None))
    (for(i<-0 to count-1) yield ((topStudents(i).name,topBottomMarks(i).marksObtained))).toList

  }
}