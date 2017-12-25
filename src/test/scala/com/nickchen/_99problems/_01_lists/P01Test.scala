package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-25 13:51.
  */
class P01Test extends FunSpec with Matchers {

  describe("P01 List builtin function") {
    it("should find last element") {
      val last = P01 last List(1,2,3)
      last should be(3)
    }
  }

  describe("P01 recursion") {
    it("should find last element") {
      val last = P01 lastRecursion List(1,2,3)
      last should be(3)
    }
  }
}
