import org.scalatest._
import com.s99.P16


class P16Spec extends FlatSpec with Matchers {

  "P16.enumerate" should "be able to enumerate lists" in {
    P16.enumerate(initialList=List(2, 3, 4)) shouldBe List((0, 2), (1, 3), (2, 4))
  }

  "P16.enumerate with initial" should "allow and initial value to iterate from" in {
    P16.enumerate(initialList=List(2, 3, 4), initial=1) shouldBe List((1, 2), (2, 3), (3, 4))
  }

  "P16" should "drop every nTH element" in {
    val initialList = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val finalList = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')

    P16.drop(3, initialList) shouldBe finalList

  }
}
