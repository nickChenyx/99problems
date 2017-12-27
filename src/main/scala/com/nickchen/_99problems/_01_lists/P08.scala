package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Eliminate consecutive duplicates of list elements.
  *
  * @author nickChen
  * @since 2017-12-26 17:34.
  */
object P08 {

  /**
    * recursion
    */
  def compressRecursion[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x::xs => x :: compressRecursion(xs.dropWhile(_==x))
  }

  /**
    * tail recursion
    */
  def compress[T](list: List[T]): List[T] = {
    @tailrec
    def compressRes(res: List[T], curList: List[T]): List[T] = curList match {
      case x::xs => if (x ==  res.last) compressRes(res, xs) else compressRes(res:::List(x), xs)
      case Nil => res
    }
    if (list.isEmpty) list else compressRes(List(list.head), list.tail)
  }

  /**
    * more functional
    */
  def compressFunc[T](list: List[T]): List[T] = list.foldLeft(List[T]()) {
    (pre, cur) => {
      if (pre.isEmpty || pre.last != cur) pre:::List(cur)
      else pre
    }
  }

}
