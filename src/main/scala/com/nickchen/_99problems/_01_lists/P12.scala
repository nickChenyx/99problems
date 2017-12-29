package com.nickchen._99problems._01_lists

/**
  * Decode a run-length encoded list.
  *
  * @author nickChen
  * @since 2017-12-28 13:41.
  */
object P12 {

  def decode[T](list: List[(Int, T)]): List[T] = {
    list.flatMap{
      e => {
        List.fill(e._1)(e._2)
      }
    }
//    list flatMap { e => makeList(e._1, e._2, List()) }
  }

  def makeList[T](len: Int, ele: T, res: List[T]): List[T] =
    if (len==0) res
    else ele::makeList(len-1, ele, res)

}
