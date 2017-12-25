package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Find the last element of a list.
  *
  * @author nickChen
  * @since 2017-12-25 11:38.
  */
object P01 {

  /**
    * using builtin last function of list
    */
  def last[T](list: List[T]) : T = list.last

  /**
    * using recursion
    */
  @tailrec
  def lastRecursion[T](list: List[T]) : T = {
    list match {
      case x :: Nil => x
      case _ :: xs => lastRecursion(xs)
      case _ => throw new NoSuchElementException("Empty list.")
    }
  }
}
