
import scala.collection.mutable.ListBuffer
class CustomStack {
  def push(srcList:ListBuffer[Int],el:Int): ListBuffer[Int] = {srcList.prepend(el)
    srcList}
  def pop(srcList:ListBuffer[Int]):ListBuffer[Int]= srcList.tail
}
