/*
package collectionassignment

/**
  * Q1. Now, I require a case class named ScoreCard having fields
  * (studentId: Long, marks: Map[Long, Float], percentage: Float).

Write a method which takes no parameter and generates a Map with key
student id and value as ScoreCard. As there can be more than one student
with same name, the logic we have to follow is that, if two or more student
has same name the key should be the name of the student and the values (ScoreCard s)
should be in a List, otherwise the key should be the student name and value should
be the case class ScoreCard. e.g. Map should be Map[String, AnyRef].

Write a method which takes input as student name and print the score cards.
If it finds one or more than one score card  print all of them other wise print
"No data found". The print should be in increasing order of the student id.



  */
object ScoreCardMap extends App{

  val l1: List[Student] = List(Student(1, "Anmol"), Student(2, "Pankhurie"), Student(3, "Shubhra"), Student(4, "Shivangi"), Student(5,"Mahesh"))

  val l2: List[Marks] = List(Marks(1, 1, 99), Marks(2, 1, 99), Marks(3, 1, 99), Marks(4, 1, 80), Marks(5, 1, 99),
    Marks(1, 2, 99), Marks(2, 2, 85), Marks(3, 2, 12), Marks(5, 2, 80), Marks(4, 2, 95),
    Marks(1, 3, 80), Marks(2, 3, 85), Marks(5, 3, 12), Marks(3, 3, 80), Marks(4, 3, 15),
    Marks(1, 4, 80), Marks(2, 4, 85), Marks(3, 4, 12), Marks(5, 4, 80), Marks(4, 4, 85),
    Marks(1, 5, 80), Marks(2, 5, 85), Marks(3, 5, 12), Marks(5, 5, 99), Marks(4, 5, 15) )

  def method():Map[String,AnyRef]={


  }
//studentId: Long, marks: Map[Long, Float], percentage: Float <-scorecard case
  def reportCardGenerator(marksList:List[Marks],studentList:List[Student]):List[ScoreCard] = {
    val tempPair1 = marksList.groupBy(x => x.studentId) //Key value pair having studentId as key & list of list of MarksCase as value
    val tempList1 = tempPair1.map(x => (x._1, x._2.map(y => y.marksObtained))).toList // Creating a list having tuples of total marks with associated studentID

    val result = for (x <- tempList1; y <- studentList if (x._1 == y.id)) yield ScoreCard(y.id, Map[x._2]) // combining the names and marks to get a new list of toppers
    result
  }
}
*/
