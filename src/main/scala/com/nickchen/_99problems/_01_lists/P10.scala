package com.nickchen._99problems._01_lists

/**
  * Run-length encoding of a list.
  *
  * @author nickChen
  * @since 2017-12-28 11:36.
  */
object P10 {

  def encode[T](list: List[T]): List[(Int, T)] = P09.pack(list).foldRight(List[(Int, T)]()) {
    (cur, tail) => (cur.length, cur.head) :: tail
  }

  def encodeByMap[T](list: List[T]): List[(Int, T)] = {
    import P09.pack
    pack(list) map(e => (e.length, e.head))
  }


}
