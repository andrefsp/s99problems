import org.scalatest._
import com.s99.P06


class P06Spec extends FlatSpec with Matchers  {

  "P06.isPalindrome" should "consider a valid palindrome true" in {
    P06.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe(true)
  }

  "P06.isPalindrome" should "consider check as false" in {
    P06.isPalindrome(List(1, 2, 3)) shouldBe(false)

  }

}
