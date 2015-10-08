package com.s99

object P19 {
  def rotate(n: Int, list: List[Any]) = {
    val splitIndex = n > 0 match {
      case true => n
      case false => n + list.length
    }
    list.slice(splitIndex, list.length) ++ list.slice(0, splitIndex)
  }
}
