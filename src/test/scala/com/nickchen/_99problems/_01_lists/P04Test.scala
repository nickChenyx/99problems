package com.nickchen._99problems._01_lists

import org.scalatest.{ FunSpec, Matchers }

/**
  * @author nickChen
  * @since 2017-12-26 15:18.
  */
class P04Test extends FunSpec with Matchers {

  describe("find the number of elements of a list, builtin") {
    it("give the list's length") {
      val list = List(1,2,3)
      P04 len list should be(3)
    }
  }

  describe("find the number of elements of a list, recursion") {
    it("give the list's length") {
      val list1 = List(1,2,3)
      P04 lenRecursion list1 should be(3)
    }
  }

  describe("find the number of elements of a list, pure function") {
    it("give the list's length") {
      val list1 = List(1,2,3)
      P04 lenF list1 should be(3)
    }
  }

}
