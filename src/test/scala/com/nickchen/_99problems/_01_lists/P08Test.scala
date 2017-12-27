package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-26 17:34.
  */
class P08Test extends FunSpec with Matchers {

  describe("eliminate consecutive duplicates of list elements") {
    it("compress") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P08 compress list should equal(List('a, 'b, 'c, 'a, 'd, 'e))

      P08 compress List() should equal(List())
    }
  }

  describe("functional implement") {
    it("compress") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P08 compressFunc list should equal(List('a, 'b, 'c, 'a, 'd, 'e))
    }
  }
}
