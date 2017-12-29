package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 10:34.
  */
class P22Test extends FunSpec with Matchers {

  describe("Create a list containing all integers within a given range.") {
    it("tailrec") {
      P22 range(4, 9) should be (List(4, 5, 6, 7, 8, 9))

      P22 range(4, 4) should be (List(4))

      P22 range(-2, 1) should be (List(-2, -1, 0, 1))

      P22 range(9, 4) should be (List())
    }

    it("unfoldr") {
      P22 rangeFunc (4, 9) should be (List(4, 5, 6, 7, 8, 9))

      P22 rangeFunc(4, 4) should be (List(4))

      P22 rangeFunc(-2, 1) should be (List(-2, -1, 0, 1))

      P22 rangeFunc(9, 4) should be (List())
    }
  }
}
