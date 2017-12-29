package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-27 10:34.
  */
class P09Test extends FunSpec with Matchers {

  describe("Pack consecutive duplicates of list elements into sublists.") {
    it("functional") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P09 pack list should equal(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

      P09 pack List() should be(List(List()))
    }
  }

  describe("Pack consecutive duplicates of list elements into sublists.") {
    it("recursion") {
      val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      P09 packRecursion  list should equal(List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

      P09 packRecursion List() should be(List(List()))
    }
  }
}
