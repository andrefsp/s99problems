package com.s99


object P08 {

  def compress(x: List[Any]) = {
    x.tail.foldLeft(List(x.head))((y: List[Any], x: Any) => {
      x == y.last match {
        case true => y
        case false => y ++ List(x)
      }
    })
  }
}
