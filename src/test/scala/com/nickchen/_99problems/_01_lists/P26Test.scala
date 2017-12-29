package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-29 13:04.
  */
class P26Test extends FunSpec with Matchers {

  describe("Generate the combinations of K distinct objects chosen from the N elements of a list.") {
    it("flatMap") {
      P26.combinations(3, List('a,'b,'c,'d)).length should be (4)

      P26.combinations(3, List('a, 'b, 'c, 'd, 'e, 'f)).length should be (20)
    }

    it("another") {
      P26.combinationsAnother(3, List('a,'b,'c,'d)).length should be (4)

      P26.combinationsAnother(3, List('a, 'b, 'c, 'd, 'e, 'f)).length should be (20)
    }
  }

}
