package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 11:37.
  */
class P24Test extends FunSpec with Matchers {

  describe("Lotto: Draw N different random numbers from the set 1..M.") {
    it("compose") {
        P24.lotto(6, 49).length should be(6)

        P24.lotto(6, 5).length should be(5)
    }
  }
}
