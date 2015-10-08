package com.s99

object P21 {

  def insertAt(element: Any, index: Int, list: List[Any]) = {
    val partition = list.zipWithIndex.partition((x: (Any, Int)) => x._2 <= index-1)
    partition._1.unzip._1 ++ List(element) ++ partition._2.unzip._1
  }
}
