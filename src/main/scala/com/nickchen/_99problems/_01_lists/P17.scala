package com.nickchen._99problems._01_lists

/**
  * Split a list into two parts.
  *
  * @author nickChen
  * @since 2017-12-28 15:00.
  */
object P17 {

  def split[T](n: Int, list: List[T]): (List[T], List[T]) = (list.take(n), list.drop(n))

  def splitBuiltin[T](n: Int, list: List[T]): (List[T], List[T]) = list.splitAt(n)

  def splitRecursion[T](n: Int, list: List[T]): (List[T], List[T]) = (n, list) match {
    case (_, Nil) => (Nil, Nil)
    case (0, xs) => (Nil, xs)
    case (m, x::xs) =>  {
      val (pre, post) = splitRecursion(m-1, xs)
      (x::pre, post)
    }
  }

  def splitTailRec[T](n: Int, list: List[T]): (List[T], List[T]) = {
    def splitR[T](n: Int, pre: List[T], last: List[T]): (List[T], List[T]) = (n, last) match {
      case (_, Nil) => (Nil, Nil)
      case (0, xs) => (pre.reverse, xs)
      case (m, x::xs) => splitR(m-1, x::pre, xs)
    }
    splitR(n, Nil, list)
  }
}
