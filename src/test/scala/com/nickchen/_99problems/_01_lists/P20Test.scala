package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 9:56.
  */
class P20Test extends FunSpec with Matchers {

  describe("Remove the Kth element from a list.") {
    it("tailrec") {
      val list =  List('a, 'b, 'c, 'd)
      P20 removeAt(1, list) should be((List('a, 'c, 'd),'b))

      P20 removeAt(10, list) should be((List('a, 'c, 'd),'b))
    }

    it("Exception") {
      var thrown = the[NoSuchElementException] thrownBy P20.removeAt(2, List(1))
      thrown.getMessage should be ("Index 2 is out of index.")
    }
  }
}
