package com.nickchen._99problems._01_lists

/**
  * Reverse a list.
  *
  * @author nickChen
  * @since 2017-12-26 15:40.
  */
object P05 {

  /**
    * builtin
    */
  def reverse(list: List[Any]): List[Any] = list.reverse

  /**
    * recursion
    */
  def reverseRecursion(list: List[Any]): List[Any] = list match {
    case x::xs => reverseRecursion(xs) ::: List(x)
    case Nil => Nil
  }

  def reverseTailRec(list: List[Any]): List[Any] = {
    def reverse(result: List[Any], curList: List[Any]): List[Any] = curList match {
      case Nil => result
      case x::xs => reverse(x::result, xs)
      }
    reverse(Nil, list)
  }
}
