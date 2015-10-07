package com.s99

object P16 {

  def enumerate(initialList: List[Any], initial: Int = 0): List[(Int, Any)] = {
    def _enumerate(i: Int = 0,
                   finalList: List[(Int, Any)] = List[(Int, Any)](),
                   initialList: List[Any]): List[(Int, Any)] = {
      i == initialList.length match {
        case true => finalList
        case false => (i + initial, initialList(i)) :: _enumerate(i + 1, finalList, initialList)
      }
    }
    _enumerate(initialList = initialList)
  }

  def dropFunctional(n: Int, x: List[Any]) : List[Any] = {
    enumerate(x, initial = 1)
      .filter((enumerated: (Int, Any)) => enumerated._1 % n != 0)
      .map((enumerate : (Int, Any)) => enumerate._2)
  }

  def drop(n: Int, x: List[Any]): List[Any] = {

     enumerate(x, initial = 1).foldLeft(List[Any]())((x: List[Any], enumerated: (Int, Any)) => {
       enumerated._1 % n match {
         case 0 => x
         case _ => x ++ List(enumerated._2)
       }
    })

  }
}
