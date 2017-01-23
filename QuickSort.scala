

object QuickSort extends App {
  def sort(list:List[Int]): List[Int] =
    if (list.length < 2) list
    else {
      val pivot = list(list.length / 2)
      sort (list filter (pivot > _)) ::: (list filter (pivot == _)) ::: sort (list filter(pivot < _))
    }


  val list = List(7,4,6,8,45,3,6,7)
  val quickList = sort(list)
  println(quickList)

}