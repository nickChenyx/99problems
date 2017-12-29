package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 15:25.
  */
class P18Test extends FunSpec with Matchers {

  describe("extract slice from a list") {
    it("recursion") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P18 slice(3, 7, list) should be( List('d, 'e, 'f, 'g))

      P18 slice(-1, 7, list) should be( List('a, 'b, 'c,'d, 'e, 'f, 'g))

      P18 slice(0, 12, list) should be( List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

      P18 slice(0, 12, List()) should be( List())

      P18 slice(1, 1, list) should be( List())

      P18 slice(1, 2, list) should be( List('b))
    }
  }
}
