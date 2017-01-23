/**
  *  List Assignment 1:
  *  Problem i:
  * Input:- (subjectId, percentage, pass/fail)
Output:- for input pass, evaluate that how much students(id, name) are passed in the inputted subjectId
	for input fail, evaluate that how much students(id, name) are failed in the inputted subjectId
Note:- percentage is the input which defines the minimum passing criteria
e.g.
Pass count: 15
Fail count: 10
  */



object PassFail extends App {

  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"))

  val l2: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) )

  println(findPassFail(l2, 1,33, "pass"))

  def findPassFail(marksList:List[Marks],id:Int,percent:Int,choice:String): Int={
    choice match {
      case "pass"=> {
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marksObtained > percent) Some(x) else None)
        count.size
      }
      case "fail"=>{
        val count = marksList.flatMap(x => if (x.subjectId == id && x.marksObtained < percent) Some(x) else None)
        count.size
      }
    }
  }
}