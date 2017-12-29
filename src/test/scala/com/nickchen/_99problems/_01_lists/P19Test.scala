package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 16:30.
  */
class P19Test extends FunSpec with Matchers {

  describe("Rotate a list N places to the left.") {
    it("builtin, positive") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P19 rotate(3, list) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))

      P19 rotate(3, List()) should be (List())
    }

    it("builtin, negative") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P19 rotate(-2, list) should be(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))

      P19 rotate(-3, List()) should be (List())
    }

    it("recursion, positive") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P19 rotateRecursion (3, list) should be(List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c))

      P19 rotateRecursion (3, List()) should be (List())
    }

    it("recursion, negative") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
      P19 rotateRecursion (-2, list) should be(List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i))

      P19 rotateRecursion (-2, List()) should be (List())
    }
  }
}
