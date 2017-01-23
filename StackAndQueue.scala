/**
  * List Assignment 2
  * problem vi
  * implement Stack and Queue using Lists.
  */

import scala.collection.mutable.ListBuffer


object StackAndQueue extends App{
  //we are inside main
  val cStack= new CustomStack
  val cQueue= new CustomQueue
  val stack=ListBuffer[Int]()
  val queue=ListBuffer[Int]()
  println("Stack Operations :" )
  println(cStack.push(stack,10))
  println(cStack.push(stack,20)) //magic
  println(cStack.push(stack,30))
  println(cStack.push(stack,40))
  println(cStack.pop(stack)) //40 should pop
  println(" Queue Operations :" )
  println(cQueue.enqueue(queue,10))
  println(cQueue.enqueue(queue,20))
  println(cQueue.enqueue(queue,30))
  println(cQueue.enqueue(queue,40))
  println(cQueue.dequeue(queue)) //10 should dequeue
}
