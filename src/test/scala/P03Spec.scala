import org.scalatest._
import com.s99.P03

class P03Spec extends FlatSpec with Matchers {

  "We" should "be able to get the Nth element of a list" in {
    P03.nth(2, List(1, 2, 4)) shouldBe(4)
  }

  "We" should "be able to get the Nth element of a String list" in  {
    P03.nth(2, List("a", "b", "c", "d")) shouldBe("c")

  }
}