import org.scalatest._
import com.s99.P22

class P22Spec extends FlatSpec with Matchers {

  "P22" should "be able to create a range list" in {
    P22.range(3, 6) shouldBe List(3, 4, 5, 6)
  }

}
