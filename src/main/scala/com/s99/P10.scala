package com.s99


trait P10 {

  def encodeToFormat(x: List[Any]): Any = (x.length, x.head)

  def _encode(x: List[Any], fx: (List[Any]) => Any): List[Any] = {

    x.isEmpty match {
      case true => x
      case false => {
        val split = x.span((k: Any) => x.head == k)
        fx(split._1) :: _encode(split._2, fx)
      }
    }

  }

  def encode(x: List[Any]): List[Any] = _encode(x, encodeToFormat)

}

object P10 extends P10
