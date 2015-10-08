package com.s99

import P22.range
import P23.randomSelect

object P24 {
  def lotto(length: Int, members: Int): List[Any] = {
    randomSelect(length, range(0, members))
  }
}
