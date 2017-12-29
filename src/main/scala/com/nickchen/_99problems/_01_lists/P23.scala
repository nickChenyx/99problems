package com.nickchen._99problems._01_lists

/**
  * Extract a given number of randomly selected elements from a list.
  *
  * @author nickChen
  * @since 2017-12-29 10:55.
  */
object P23 {

  import P20.removeAt

  /**
    * No Exception Solution, even if n > list.length
    */
  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def randomSelectR(m: Int, ls: List[T], random: util.Random): List[T] =
      if (m<=0) Nil
      else if (ls.isEmpty) Nil
      else {
        val (remain, thrown) = removeAt(random.nextInt(ls.length), ls)
        thrown :: randomSelect(n-1, remain)
      }
    val random = new util.Random
    randomSelectR(n, list, random)
  }

}
