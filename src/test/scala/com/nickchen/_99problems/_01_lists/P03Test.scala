package com.nickchen._99problems._01_lists

import org.scalatest.{ FunSpec, Matchers }
/**
  * @author nickChen
  * @since 2017-12-26 15:03.
  */
class P03Test extends FunSpec with Matchers {
  describe("Kth element of List builtin") {
    it("give the kth element of the list") {
      val list = List(1,2,3)
      P03.nth(0, list) should be(1)
    }

    it("throw Exception") {
      val e = the[NoSuchElementException] thrownBy P03.nth(0, List())
      e.getMessage should be(null)
    }
  }

  describe("Kth element of List, recursion") {
    it("give the kth element of the list") {
      val list = List(1,2,3)
      P03.nthRecursion(0, list) should be(1)
    }

    it("throw Exception") {
      val e = the[NoSuchElementException] thrownBy P03.nthRecursion(0, List())
      e.getMessage should be(null)
    }
  }
}
