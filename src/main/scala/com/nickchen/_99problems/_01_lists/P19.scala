package com.nickchen._99problems._01_lists

import scala.annotation.tailrec

/**
  * Rotate a list N places to the left.
  *
  * @author nickChen
  * @since 2017-12-28 16:30.
  */
object P19 {

  def rotate[T](n: Int, list: List[T]): List[T] =
    if (n > 0) list.drop(n):::list.take(n)
    else list.takeRight(-n) ::: list.dropRight(-n)

  def rotateRecursion[T](n: Int, list: List[T]): List[T] = {
    @tailrec
    def rotateR(m: Int, curList: List[T], res: List[T], positive: Boolean): List[T] = (m, curList) match {
      case (_, Nil) => if (positive) curList:::res else res.reverse:::curList.reverse
      case (0, _) => if (positive) curList:::res else res.reverse:::curList.reverse
      case (_, x::xs) => rotateR(m-1, xs, res:::List(x), positive)
    }
    rotateR(math.abs(n), if (n>0) list else list.reverse, Nil, n>0)
  }

}
