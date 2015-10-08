package com.s99

object P01 {
  /*
    |P01 (*) Find the last element of a list.
    |Example:
    |scala> last(List(1, 1, 2, 3, 5, 8))
    |res0: Int = 8
  */

  def _last[T <: Seq[Any]](x: T) = x.last

  def last[T](x: Seq[T]) = x.last
}
