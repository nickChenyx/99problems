package com.nickchen._99problems._01_lists

import org.scalatest.{FunSpec, Matchers}

/**
  * @author nickChen
  * @since 2017-12-26 16:02.
  */
class P06Test extends FunSpec with Matchers {

  describe("check is palindrome, builtin") {
    it("palindrome") {
      val list = List(1,2,2,1)
      P06 isPalindrome list should be(true)

      P06 isPalindrome List() should be(true)
    }
  }

  describe("check is palindrome, recursion") {
    it("palindrome") {
      val list = List(1,2,2,1)
      P06 isPalindromeR list should be(true)

      P06 isPalindromeR List() should be(true)
    }
  }
}
