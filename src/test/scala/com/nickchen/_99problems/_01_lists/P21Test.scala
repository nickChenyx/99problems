package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 10:16.
  */
class P21Test extends FunSpec with Matchers {

  describe("Insert an element at a given position into a list.") {
    it("tailrec") {
      val list = List('a, 'b, 'c, 'd)
      P21 insertAt('new, 1, list) should be (List('a, 'new, 'b, 'c, 'd))

      P21 insertAt('new, -1, list) should be (List('a, 'b, 'c, 'd))

      P21 insertAt('new, 10, list) should be (List('a, 'b, 'c, 'd))
    }

  }
}
