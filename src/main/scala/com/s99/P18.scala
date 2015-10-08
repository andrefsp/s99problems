package com.s99

object P18 {

  def slice(lower: Int, top: Int, list: List[Any]) = {
    list.zipWithIndex
        .filter((x: (Any, Int)) => x._2 >= lower && x._2 < top)
        .map((x: (Any, Int)) => x._1)
  }
}
