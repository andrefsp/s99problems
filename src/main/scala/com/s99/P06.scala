package com.s99


object P06 {

  def isPalindrome[T](x: List[T]): Boolean = {

    def checkPalindrome(leftIndex: Integer, rightIndex: Integer): Boolean = {
        rightIndex - leftIndex <= 1 match {
          case true => true
          case false => {
            x(leftIndex) == x(rightIndex) match {
              case false => false
              case true => checkPalindrome(leftIndex + 1, rightIndex - 1)
            }
          }
        }
    }

    checkPalindrome(0, x.length-1)
  }

}
