package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-28 13:27.
  */
class P11Test extends FunSpec with Matchers {
  describe("Modified run-length encoding. by P09") {
    it("map") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P11 encode list should be(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    }
  }
  describe("Modified run-length encoding. by P10") {
    it("p10") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P11 encodeByP10 list should be(List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
    }
  }
  describe("Modified run-length encoding. Typesafe") {
    it("typesafe") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P11 encodeTypeSafe list should be(List(Right((4,'a)), Left('b), Right((2,'c)), Right((2,'a)), Left('d), Right((4,'e))))
    }
  }
}
