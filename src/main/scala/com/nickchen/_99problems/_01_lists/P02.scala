package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Find the last but one element of a list.
  *
  * @author nickChen
  * @since 2017-12-26 14:22.
  */
object P02 {

  /**
    * builtin
    */
  def secondLast[T](list: List[T]): T =
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last

  /**
    * recursion way
    */
  @tailrec
  def secondLastRecursion[T](list: List[T]): T = list match {
      case x::_::Nil => x
      case _::tail => secondLastRecursion(tail)
      case _ => throw new NoSuchElementException("Can't find secondLast element from a list with less than 2 elements")
    }
}
