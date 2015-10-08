import org.scalatest._
import com.s99.P14

class P14Spec extends FlatSpec with Matchers {
  "P14" should "duplicate the elements on a list" in {
    P14.duplicate(List('a', 'b', 'c')) shouldBe List('a', 'a', 'b', 'b', 'c', 'c')
  }
}
