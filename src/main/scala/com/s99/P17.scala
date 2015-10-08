package com.s99


object P17 {

  def split(splitIndex: Int, list: List[Any]): (List[Any], List[Any]) = {
    val partition = list.zipWithIndex.partition((x:(Any, Int)) => x._2 <= splitIndex-1)
    (partition._1.map((x: (Any, Int)) => x._1), partition._2.map((x: (Any, Int)) => x._1))
  }
}
