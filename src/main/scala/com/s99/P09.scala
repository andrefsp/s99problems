package com.s99


object P09 {

  def pack(x: List[Any]): List[Any] = {
    x.isEmpty match {
      case true => x
      case false => {
        val split = x.span((k: Any) => x.head == k)
        split._1 :: pack(split._2)
      }
    }
  }

}
