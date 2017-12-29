package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 10:55.
  */
class P23Test extends FunSpec with Matchers {

  describe("Extract a given number of randomly selected elements from a list.") {
    it("recursion") {
      val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
      P23.randomSelect(4, list).length  should be(4)

      P23.randomSelect(10, list).length  should be(list.length)
    }
  }
}
