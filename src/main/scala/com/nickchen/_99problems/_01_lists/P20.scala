package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Remove the Kth element from a list.
  *
  * @author nickChen
  * @since 2017-12-29 9:55.
  */
object P20 {

  def removeAt[T](n: Int, list: List[T]): (List[T], T) ={
    @tailrec
    def removeAtR(m: Int, ls: List[T], pre: List[T]): (List[T], T) = (m, ls) match {
      case (_, Nil) => throw new NoSuchElementException(s"Index $n is out of index.")
      case (0, x::xs) => (pre.reverse:::xs, x)
      case (_, x::xs) => removeAtR(m-1, xs, x::pre)
    }
    removeAtR(n, list, Nil)
  }

}
