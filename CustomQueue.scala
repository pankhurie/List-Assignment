
import scala.collection.mutable.ListBuffer
class CustomQueue {
  def enqueue(srcList:ListBuffer[Int],el:Int): ListBuffer[Int] = {srcList.+=(el)
  }
  def dequeue(srcList:ListBuffer[Int]):ListBuffer[Int]= srcList.tail
}
