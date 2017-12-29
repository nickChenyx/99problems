package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 14:25.
  */
class P14Test extends FunSpec with Matchers {

  describe("duplicate list") {
    it("double") {
      val list = List('a, 'b, 'c, 'c, 'd)
      P14 duplicate list should be(List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))

      P14 duplicate List() should be (List())
    }
  }

}
