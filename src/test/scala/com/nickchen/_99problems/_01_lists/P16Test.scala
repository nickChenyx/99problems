package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 14:37.
  */
class P16Test extends FunSpec with Matchers {

  describe("drop nth element from a list") {
    it("fold") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P16 drop(3, list) should be( List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

      P16 drop(0, List()) should be( List())
    }
  }
  describe("drop nth element from a list") {
    it("recursion") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P16 dropRecursion (3, list) should be( List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

      P16 dropRecursion (0, List()) should be( List())
    }
  }
  describe("drop nth element from a list") {
    it("tailrec") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P16 dropTailRec (3, list) should be( List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))

      P16 dropTailRec (0, List()) should be( List())
    }
  }

}
