package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-26 14:41.
  */
class P02Test extends FunSpec with Matchers{

  describe("SecondLastRecursion element in the list") {
    it("give the secondLast element") {
      val list = List(1,2,3)
      P02 secondLastRecursion list should be(2)
    }
    it("throw new NoSuchElementException"){
      val thrown = the[NoSuchElementException] thrownBy P02.secondLastRecursion(List())
      thrown.getMessage should equal("Can't find secondLast element from a list with less than 2 elements")
    }
  }

  describe("builtin method implement.") {
    it("give the secondLast element") {
      val list = List(1,3)
      P02 secondLast list should be(1)
    }
    it("throw new NoSuchElementException"){
      val thrown = the[NoSuchElementException] thrownBy P02.secondLast(List())
      thrown.getMessage should equal(null)
    }
  }
}
