package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Create a list containing all integers within a given range.
  *
  * @author nickChen
  * @since 2017-12-29 10:34.
  */
object P22 {

  def range(from: Int, until: Int): List[Int] = {
    @tailrec
    def rangeR(start:Int, res:List[Int]): List[Int] = start match {
      case x:Int if x > from => rangeR(start-1, x::res)
      case `from` => from::res
      case _ => Nil
    }
    rangeR(until, Nil)
  }

  /**
    * classic functional approach, `unfoldr` implement.
    */
  def unfoldr[A, B](s: B)(f: B => Option[(A,B)]): List[A] =
    f(s) match {
      case None => Nil
      case Some((r,n)) => r :: unfoldr(n)(f)
    }

  def rangeFunc(from: Int, until: Int): List[Int] = unfoldr(from) {
    n => if (n <= until) Some((n, n + 1))
    else None
  }
}
