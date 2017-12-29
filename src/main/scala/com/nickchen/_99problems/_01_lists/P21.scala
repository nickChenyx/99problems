package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Insert an element at a given position into a list.
  *
  * @author nickChen
  * @since 2017-12-29 10:16.
  */
object P21 {

  def insertAt[T](t: T, n: Int, list: List[T]): List[T] = {
    @tailrec
    def insertAtR(m: Int, curList: List[T], pre: List[T]): List[T] = (m, curList) match {
      case (_, Nil) => list // no exception, keep the scene
      case (0, xs) => (t::pre).reverse ::: xs
      case (_, x::xs) => insertAtR(m-1, xs, x::pre)
    }
    insertAtR(n, list, Nil)
  }

}
