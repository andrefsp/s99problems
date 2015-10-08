import org.scalatest._
import com.s99.P20


class P20Spec extends FlatSpec with Matchers {

  "P20" should "allow to remove element with remove" in {
    val initialList = List('a', 'b', 'c', 'd')

    P20.removeAt(1, initialList) shouldBe (List('a', 'c', 'd'), 'b')
  }
}
