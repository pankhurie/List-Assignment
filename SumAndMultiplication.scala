/**
  * List Assignment 2
  * problem iv
  *  find sum and multiplication of the list (dont use inbuilt methods)
  */

object SumAndMultiplication extends App{
  val list = List(1,2,3,4,5)

  println(s"Sum of ${list} : ${sum(list)}")
  println(s"Product of ${list}: ${multiply(list)}")

  def sum(listToSum: List[Int]):Int={
    def innerSum(listToSum:List[Int], index:Int, sum:Int):Int={
      if(!listToSum.isEmpty) innerSum(listToSum.tail, index+1, sum+(listToSum.head))
      else sum
    }

    innerSum(listToSum,0,0)

  }
def multiply(srcList:List[Int]):Int={
  def innerMultiply(srcList:List[Int],index:Int,mul:Int): Int ={
    if(!srcList.isEmpty) innerMultiply(srcList.tail,index+1,mul*srcList.head)
    else mul
  }
  innerMultiply(srcList,0,1)
}
}

