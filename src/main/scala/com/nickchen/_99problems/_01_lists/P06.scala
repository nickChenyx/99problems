package com.nickchen._99problems._01_lists

/**
  * Find out whether a list is a palindrome.
  *
  * @author nickChen
  * @since 2017-12-26 16:01.
  */
object P06 {

  /**
    * builtin
    */
  def isPalindrome(list: List[Any]): Boolean = list == list.reverse

  /**
    * recursion
    */
  def isPalindromeR(list: List[Any]): Boolean = list match {
    case Nil => true
    case _::Nil => true
    case x::xs => if (x == xs.last) {
      println(xs.init)
      isPalindromeR(xs.init)
    } else false
  }
}
