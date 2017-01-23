/**
  * List Assignment 2:
  * problem iii:
  * aggregate the contents of two lists of same size into a single list
	List(1,2) and List("a", "b") results List(List(1, "a"), List(2, "b"))
  */

object Aggregate{

  def main(args:Array[String]):Unit={
    val list1= List(1,2,3,4,5)
    val list2=List('a','b','c','d','e')

    val list3=findAggregate(list1,list2)
    list3 map (println _)

  }
  def findAggregate(list1: List[Int], list2: List[Char]):List[(Int,Char)]={
    def innerAggregate(list1: List[Int], list2: List[Char], result:List[(Int,Char)],len:Int):List[(Int,Char)]={
      if(len==list1.length) result
      else innerAggregate(list1,list2,(list1(len),list2(len))::result,len+1)
    }

    innerAggregate(list1,list2,List[(Int,Char)]():+(list1(0),list2(0)),1)
  }

}