package com.nickchen._99problems._01_lists

/**
  * Lotto: Draw N different random numbers from the set 1..M.
  *
  * @author nickChen
  * @since 2017-12-29 11:32.
  */
object P24 {

  import P23.randomSelect, P22.rangeFunc

  def lotto(n: Int, bound: Int): List[Int] = randomSelect(n, rangeFunc(1, bound))
}
