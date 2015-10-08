import org.scalatest._
import com.s99.P21

class P21Spec extends FlatSpec with Matchers {
  "P21" should "allow to insert an element" in {
    P21.insertAt('new, 1, List('a, 'b, 'c, 'd)) shouldBe List('a, 'new, 'b, 'c, 'd)
  }

}
