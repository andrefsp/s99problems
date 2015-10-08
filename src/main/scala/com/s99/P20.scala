package com.s99

trait P20 {
  def removeAt(n: Int, list: List[Any]): (List[Any], Any) = {
    val partition = list.zipWithIndex.partition((x: (Any, Int)) => x._2 != n)
    (partition._1.map((x: (Any, Int)) => x._1), partition._2(0)._1)
  }
}

object P20 extends P20 {}
