package com.nickchen._99problems._01_lists

/**
  * Duplicate the elements of a list a given number of times.
  *
  * @author nickChen
  * @since 2017-12-28 14:30.
  */
object P15 {

  def duplicateN[T](len: Int, list: List[T]): List[T] = list.flatMap {
    e => List.fill(len)(e)
  }

}
