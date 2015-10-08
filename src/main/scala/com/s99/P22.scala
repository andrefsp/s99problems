package com.s99

object P22 {
  def range(lower: Int, top: Int, increment: Int = 0): List[Int] = {
    lower + increment == top match {
      case true => List(top)
      case false => lower + increment :: range(lower, top, increment + 1)
    }
  }
}
