package com.s99


trait P14 extends P12{

   def duplicateN(repetitions: Int, x: List[Char]) = {
    x.foldLeft(List[Char]())((y: List[Char], c: Char) => {
      y ++ createList(repetitions, c)
    })
  }

}

object P14 extends P14 {

  def duplicate(x: List[Char]) = duplicateN(2, x)

}
