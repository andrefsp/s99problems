package com.s99

object P25 {
  import P23.randomSelect

  def randomPermute(list: List[Any]): List[Any] = randomSelect(list.length, list)

}
