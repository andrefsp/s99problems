import org.scalatest._
import com.s99.P19

class P19Spec extends FlatSpec with Matchers {

    "P19.rotate" should "allow to rotate lists" in {
      val initialList = List('a', 'b', 'c', 'd', 'e')
      val finalList = List('c', 'd', 'e', 'a', 'b')

      P19.rotate(2, initialList) shouldBe finalList
    }

  "P19 rotate negative" should "allow to rotate lists" in {
      val initialList = List('a', 'b', 'c', 'd', 'e')
      val finalList = List('d', 'e', 'a', 'b', 'c')

      P19.rotate(-2, initialList) shouldBe finalList
  }

}
