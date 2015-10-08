package com.s99


object P04 {

  def length[T <: Any](x: List[T]): Integer = {
    def getLength(currentIndex: Integer, remainingList: List[T]): Integer = {
      remainingList.isEmpty match {
        case true => currentIndex
        case false => getLength(currentIndex+1, remainingList.tail)
      }
    }
    getLength(0, x)
  }

}
