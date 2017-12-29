package com.nickchen._99problems._01_lists

/**
  * Pack consecutive duplicates of list elements into sublists.
  *
  * @author nickChen
  * @since 2017-12-27 10:33.
  */
object P09 {

  /**
    * functional solution
    */
  def pack[T](list: List[T]): List[List[T]] = list.foldRight(List[List[T]](List[T]())) {
    (cur, tail) =>
      if (tail.head.isEmpty || tail.head.head == cur) (cur :: tail.head) :: tail.tail
      else List(cur) :: tail
  }

  /**
    * recursion
    */
  def packRecursion[T](list: List[T]): List[List[T]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span { _ == list.head }
      if (next == Nil) List(packed)
      else packed :: packRecursion(next)
    }
  }
}
