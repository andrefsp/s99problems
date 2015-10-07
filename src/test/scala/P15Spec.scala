import org.scalatest._
import com.s99.P15


class P15Spec extends FlatSpec with Matchers {

  "P15" should "allow to specify number of repetitions" in {
    val initialList = List('a', 'b', 'c', 'c', 'd')
    val finalList = List('a', 'a', 'a', 'b', 'b', 'b',
                         'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')

    P15.duplicateN(3, initialList) shouldBe finalList

  }
}
