package com.s99

/**
 * Created by andrefsp on 01/10/15.
 */
object P07 {

  def flatten(x :List[Any]): List[Any] = {
    x.flatMap(k => {
      k match {
        case ms: List[_] => flatten(ms)
        case e => List(e)
      }
    })
  }

}
