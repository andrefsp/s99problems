package com.s99


object P03 {

  def nth[T](index: Integer, x: List[T]) = {
    def recurse(currentIndex: Integer, x: List[T]): T = {
      currentIndex == index match {
        case true => x.head
        case false => recurse(currentIndex+1, x.tail)
      }
    }
    recurse(0, x)
  }

}
