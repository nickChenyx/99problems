package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Extract a slice from a list.
  *
  * @author nickChen
  * @since 2017-12-28 15:25.
  */
object P18 {

  /* List.slice(from. until) */

  def slice[T](start: Int, end: Int, list: List[T]): List[T] = {
    if (start > end) throw new IllegalArgumentException("start should equals or less than end.")
    else {
      @tailrec
      def sliceR(cur: Int, list: List[T], res: List[T]): List[T] = (cur, list) match {
        case (_, Nil) => res.reverse
        case (`end`, _) => res.reverse
        case (m, x::xs) =>
          if (m >= start) sliceR(m+1, xs, x::res) else sliceR(m+1, xs, res)
      }
      sliceR(0, list, Nil)
    }
  }

}
