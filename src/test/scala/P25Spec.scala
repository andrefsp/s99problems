import org.scalatest._
import com.s99.P25

class P25Spec extends FlatSpec with Matchers {

  "P25" should "be able to generate random permutations" in {
    val initialList = List('a', 'b', 'c', 'd')
    val generateList = P25.randomPermute(initialList)

    initialList.map((member: Any) => generateList.count((x: Any) => x == member) shouldBe 1)
  }
}
