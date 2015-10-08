import org.scalatest._
import com.s99.P18

class P18Spec extends FlatSpec with Matchers {
  "P18.splice" should "be able to slice a list" in {
    val initialList = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val finalList = List('d', 'e', 'f', 'g')
    P18.slice(3, 7, initialList) shouldBe finalList
  }
}
