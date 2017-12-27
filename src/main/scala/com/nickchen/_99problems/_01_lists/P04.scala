package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Find the number of elements of a list.
  *
  * @author nickChen
  * @since 2017-12-26 15:17.
  */
object P04 {
  /**
    * builtin
    */
  def len(list: List[Any]): Int = list.length

  /**
    * recursion
    */
  def lenRecursion(list: List[Any]): Int = {
    @tailrec
    def lenRecursion(list: List[Any], n: Int): Int = list match {
      case _ :: xs => lenRecursion(xs, n + 1)
      case _ => n
    }

    lenRecursion(list, 0)
  }

  /**
    * more pure functional solution
    */
  def lenF(list: List[Any]): Int = list.foldLeft(0) { (o, _) => o + 1 }
}
