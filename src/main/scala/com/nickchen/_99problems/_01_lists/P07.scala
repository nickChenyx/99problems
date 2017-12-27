package com.nickchen._99problems._01_lists

/**
  * Flatten a nested list structure.
  *
  * @author nickChen
  * @since 2017-12-26 16:41.
  */
object P07 {

  /**
    * recursion
    */
  def flattenR(list: List[Any]): List[Any] = list.flatMap {
    case xs: List[_] => flattenR(xs)
    case x => List(x)
  }
}
