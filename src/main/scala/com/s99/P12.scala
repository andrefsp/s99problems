package com.s99

trait P12 {

  def createList(number: Int, character: Char) : List[Char] = {
    def expand(i: Int, c: Char, l: List[Char]): List[Char] = {
      i match {
        case 0  => l
        case _ => c :: expand(i-1, c, l)
      }

    }
    expand(number, character, List[Char]())
  }

}


object P12 extends P12{

  def decode(x: List[Any]): List[Char] = {

    x.foldLeft(List[Char]())((y: List[Char], k: Any) => {
      k match {
        case (number: Int, value: Char) => y ++ createList(number, value)
        case _ => y
      }
    })

  }

}
