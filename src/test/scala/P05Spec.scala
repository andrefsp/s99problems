import org.scalatest._
import com.s99.P05

class P05Spec extends FlatSpec with Matchers {

  "we" should "be able to reverse a list" in {
    val list = List(1, 2, 3)
    P05.reverse(list) shouldBe list.reverse
  }

  "we" should "be able to reverse a string list" in {
    val list = List("a", "b", "c")
    P05.reverse(list) shouldBe list.reverse
  }

}
