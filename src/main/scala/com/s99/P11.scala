package com.s99

object P11 extends P10 {

  def encodeToMultiple(x: List[Any]): Any = {
    x.length match {
      case 1 => x.head
      case _ => encodeToFormat(x)
    }
  }

  def encodeModify(x: List[Any]): List[Any] = _encode(x, encodeToMultiple)
}
