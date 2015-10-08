package com.s99
import scala.util.Random


object P23 extends P20 {

  def randomSelect(n: Int, list: List[Any]): List[Any] = {
    def pickRandom(decrement: Int, remaing: List[Any], randomList: List[Any]): List[Any] = {
      decrement == 0 match {
        case true => randomList
        case false => {
          val charTuple = removeAt(Random.nextInt(remaing.length), remaing)
          pickRandom(decrement-1, charTuple._1, randomList ++ List(charTuple._2))
        }
      }
    }
    pickRandom(n, list, List())
  }

}
