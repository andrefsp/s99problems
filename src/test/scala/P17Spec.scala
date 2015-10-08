import org.scalatest._
import com.s99.P17


class P17Spec extends FlatSpec with Matchers {
  "P17.split" should "split the list into two parts" in {
      val initialList = List(1, 2, 3, 4, 5)
      P17.split(3, initialList) shouldBe (List(1, 2, 3), List(4, 5))
  }
}
