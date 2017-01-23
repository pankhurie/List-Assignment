object Trial extends App{
  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"), Student(3, "Shubhra"), Student(4, "Shivangi"), Student(5,"Mahesh"))
  val l2: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) )

  def toppers(l:List[Student],l1:List[Marks],id:Int,count:Int,choice:String)
  {

    val l2=l1.sortBy(x=>x.marksObtained)
//    l2 map println _
    val l3=l2.reverse
//    l3 map println _
    val listOfMarksWithId = choice match {
      case "top"=>
        l2.map(x => if (x.subjectId == id ) Some(x) else None)
      case "bottom"=>
        l3.map(x => if (x.subjectId == id ) Some(x) else None)

    }
    println(listOfMarksWithId)

    //l1: student list
    /**
      *  val topStudents = topBottomMarks.flatMap (y =>l1.flatMap(x=> if (y.studentId==(x.id)) Some(x) else None))
    (for(i<-0 to count-1) yield ((topStudents(i).name,topBottomMarks(i).marksObtained))).toList
      */
//    val topStudents = listOfMarksWithId.flatMap(y=> l1.flatMap(x=> if(y. == student.studentId) Some(student) else None))

  }
  print("Toppers Are : ")
  toppers(l1,l2,4,4,"top")
  println()
  print("Lowest ones are :")
  toppers(l1,l2,4,4,"bottom")
}