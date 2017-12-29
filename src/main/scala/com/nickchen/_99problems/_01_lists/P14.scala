package com.nickchen._99problems._01_lists

/**
  * Duplicate the elements of a list.
  *
  * @author nickChen
  * @since 2017-12-28 14:25.
  */
object P14 {

  def duplicate[T](list: List[T]): List[T] = list.flatMap {
    e => List(e, e)
  }
}
