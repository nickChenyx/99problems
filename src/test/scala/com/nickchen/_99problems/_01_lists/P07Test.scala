package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-26 16:41.
  */
class P07Test extends FunSpec with Matchers {

  describe("flatten") {
    it("flatten") {
      val list = List(List(1, 1), 2, List(3, List(5, 8)))
      print (P07 flattenR list)
    }
  }
}
