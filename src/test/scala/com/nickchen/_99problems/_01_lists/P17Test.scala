package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 15:00.
  */
class P17Test extends FunSpec with Matchers {

  describe("split a list into two parts") {
    it("drop") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P17 split(3, list) should be((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

      P17 split(3, List()) should be ((List(),List()))

      P17 split(-1, List()) should be ((List(),List()))
    }
  }
  describe("split a list into two parts") {
    it("recursion") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P17 splitRecursion (3, list) should be((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

      P17 splitRecursion(3, List()) should be ((List(),List()))

      P17 splitRecursion(-1, List()) should be ((List(),List()))
    }
  }
  describe("split a list into two parts") {
    it("tailrec") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P17 splitTailRec (3, list) should be((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

      P17 splitTailRec(3, List()) should be ((List(),List()))

      P17 splitTailRec(-1, List()) should be ((List(),List()))
    }
  }
}
