import org.scalatest._
import com.s99.P02

class P02Spec extends FlatSpec with Matchers {
  "p02" should "allow us to get the second to last element on a list" in {
    P02.secondToLast(List(1, 2, 3, 4)) shouldBe(3)
  }

  "p02" should "allow us to get the second element on a string list" in {
    P02.secondToLast(List("a", "b", "c")) shouldBe("b")
  }
}
