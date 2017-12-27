package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Find the Kth element of a list.
  *
  * @author nickChen
  * @since 2017-12-26 14:57.
  */
object P03 {
  def nth[T](n: Int, list: List[T]): T =
    if (n > list.length-1 || n < -list.length) throw new IllegalArgumentException("N Error")
    else list(n)
//    else list.take(n+1).last

  @tailrec
  def nthRecursion[T](n: Int, list: List[T]): T = list match {
      case x :: xs => if (n==0) x else nthRecursion(n-1, xs)
      case _ => throw new NoSuchElementException
    }
}
