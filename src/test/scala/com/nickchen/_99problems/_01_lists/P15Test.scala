package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 14:30.
  */
class P15Test extends FunSpec with Matchers {

  describe("duplicate n times") {
    it("n") {
      val list = List('a, 'b, 'c, 'c, 'd)
      P15 duplicateN(3, list) should be( List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))

      P15 duplicateN(0, list) should be (List())

      P15 duplicateN(-1, list) should be (List())
    }
  }
}
