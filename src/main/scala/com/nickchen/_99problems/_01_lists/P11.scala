package com.nickchen._99problems._01_lists

/**
  * Modified run-length encoding.
  *
  * @author nickChen
  * @since 2017-12-28 13:27.
  */
object P11 {

  def encode[T](list: List[T]): List[Any] = {
    import P09.pack
    pack(list) map {
      e => if (e.length > 1) (e.length, e.head)
      else e.head
    }
  }

  def encodeByP10[T](list: List[T]): List[Any] = {
    P10.encode(list) map {
      e => if (e._1 == 1) e._2 else e
    }
  }

  /**
    * Type safe version
    */
  def encodeTypeSafe[T](list: List[T]): List[Either[T, (Int, T)]] = {
    P10.encode(list) map {
      e => if (e._1 == 1) Left(e._2) else Right(e)
    }
  }

}
