package com.s99

object P26 {

  def combinations[T](n: Int, list: List[T]): List[List[T]] = {
    n match {
      case 0 => List(List[T]())
      case _ => {
        list.zipWithIndex.foldLeft(List[List[T]]())((generatedList: List[List[T]], x: (T, Int)) => {
          generatedList ++ combinations(n-1, list.slice(x._2 + 1, list.length)).map((z: List[T]) => {
            z ++ List(x._1)}
          )
        })
      }
    }
  }
}
