package com.s99


object P05 {

  def reverse[T](x: Seq[T]): Seq[T] = {
    def reverseSequence(list: Seq[T], remaining: Seq[T]): Seq[T]  = {
      remaining.isEmpty match {
        case true => list
        case false => reverseSequence(Seq(remaining.head) ++ list, remaining.tail)
      }
    }

    reverseSequence(Seq(), x)
  }
}
