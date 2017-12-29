package com.nickchen._99problems._01_lists

/**
  * Generate a random permutation of the elements of a list.
  *
  * @author nickChen
  * @since 2017-12-29 11:41.
  */
object P25 {

  import P23.randomSelect
  def randomPermute[T](list: List[T]): List[T] = randomSelect(list.length, list)

}
