package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 11:43.
  */
class P25Test extends FunSpec with Matchers {

  describe("Generate a random permutation of the elements of a list.") {
    it("randomPermute") {
      val list = List('a, 'b, 'c, 'd, 'e, 'f)

      /* perhaps equal */
      P25.randomPermute(list)  should not equal list
    }
  }
}
