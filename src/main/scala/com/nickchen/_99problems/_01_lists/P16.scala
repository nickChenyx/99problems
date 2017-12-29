package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Drop every Nth element from a list.
  *
  * @author nickChen
  * @since 2017-12-28 14:37.
  */
object P16 {

  def drop[T](n: Int, list: List[T]): List[T] = list.foldLeft((List[T](),1)) {
    (pre, cur) => {
      if (pre._2 == n) (pre._1, 1)
      else (pre._1:::List(cur), pre._2+1)
    }
  }._1

  def dropRecursion[T](n: Int, list: List[T]): List[T] = {
    def dropR(m: Int, curList: List[T]): List[T] = (m, curList) match {
      case (_, Nil) => curList
      case (1, _::xs) => dropR(n, xs)
      case (_, x::xs) => x :: dropR(m-1, xs)
    }
    dropR(n, list)
  }

  def dropTailRec[T](n: Int, list: List[T]): List[T] = {
    @tailrec
    def dropR(m: Int, curList: List[T], res: List[T]): List[T] = (m, curList) match {
      case (_, Nil) => res.reverse
      case (1, _::xs) => dropR(n, xs, res)
      case (_, x::xs) => dropR(m-1, xs, x :: res)
    }
    dropR(n, list, Nil)
  }
}
