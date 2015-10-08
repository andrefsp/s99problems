import org.scalatest._
import com.s99.P04

class P04Spec extends FlatSpec with Matchers {

  "we" should "be able to get the lenght of a list" in {
    P04.length(List(1, 2, 3, 5, 6 )) shouldBe(5)
  }

  "we" should "be able to get the length of a list of strings" in {
    P04.length(List("a", "b", "c")) shouldBe(3)
  }
}
