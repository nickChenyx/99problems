package com.nickchen._99problems._01_lists

import org.scalatest.{ FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-26 15:40.
  */
class P05Test extends FunSpec with Matchers {

  describe("reverse a list, builtin") {
    it("reverse") {
      val list = List(1,2,3,4)
      P05 reverse list should equal(List(4,3,2,1))
    }
  }

  describe("reverse a list, recursion") {
    it("reverse") {
      val list = List(1,2,3,4)
      P05 reverseRecursion list should equal(List(4,3,2,1))

      P05 reverseRecursion List() should equal(List())
    }
  }

  describe("reverse a list, tail recursion") {
    it("reverse") {
      val list = List(1,2,3,4)
      P05 reverseTailRec list should equal(List(4,3,2,1))

      P05 reverseTailRec List() should equal(List())
    }
  }

}
