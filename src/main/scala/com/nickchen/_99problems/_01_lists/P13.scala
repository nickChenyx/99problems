package com.nickchen._99problems._01_lists

/**
  * Run-length encoding of a list (direct solution).
  *
  * @author nickChen
  * @since 2017-12-28 14:04.
  */
object P13 {

  def encodeDirectFold[T](list: List[T]): List[(Int, T)] = list.foldLeft(List[(Int, T)]()) {
    (pre, cur) => {
      if (pre.isEmpty || pre.last._2 != cur) pre ::: List((1, cur))
      else pre.init ::: List((pre.last._1+1, cur))
    }
  }

  def encodeDirect[T](list: List[T]): List[(Int, T)] =
    if (list.isEmpty) Nil
    else{
      val (packed, next) = list span {_==list.head}
      (packed.length, packed.head) :: encodeDirect(next)
    }
}
