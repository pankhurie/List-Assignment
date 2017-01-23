/**
  * List Assignment 2:
  * Problem i:
  * Find the last element of list with its index value(dont use inbuilt methods to extract last element directly)
  */

object LastElement {
  def main(args: Array[String]): Unit = {

    val list = List(10, 20, 30, 40, 50, 60)
    val result = removeLast(list:+('e'))
    println(result)
  }
  def removeLast(list: List[Any]):(Any,Int)={
    def removing(lst:List[Any],index:Int):(Any,Int)={
      if(lst(index)=='e') (lst(index-1),index-1)
      else removing(lst,index+1)
    }
    removing(list,0)
  }
}