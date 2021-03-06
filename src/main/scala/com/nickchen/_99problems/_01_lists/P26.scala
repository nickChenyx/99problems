package com.nickchen._99problems._01_lists

/**
  * Generate the combinations of K distinct objects chosen from the N elements of a list.
  *
  * @author nickChen
  * @since 2017-12-29 13:04.
  */
object P26 {

  /**
    * Cannot understand such amazing operation...
    */
  def flatMapSublists[A, B](ls: List[A])(f: (List[A] => List[B])): List[B] =
    ls match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist)::: flatMapSublists(tail)(f)
    }

  def combinations[T](n: Int, list: List[T]): List[List[T]] = {
    if (n==0) List(Nil)
    else flatMapSublists(list) {
      l => combinations(n-1, l.tail) map { l.head :: _ }
    }
  }

  /**
    * built-in
    */

  def combinationsBuiltin[T](n: Int, list: List[T]): List[List[T]] = list.combinations(n).toList

  /**
    * another solution
    */
  def combinationsAnother[T](n: Int, list: List[T]): List[List[T]] = list match {
    case _ if n == 1 => list.map(List(_)) // choose the last element
    case x::xs => combinationsAnother(n-1, xs).map( x::_ ) ::: combinationsAnother(n, xs) // next element ::: head element
    case Nil => Nil
  }
}
