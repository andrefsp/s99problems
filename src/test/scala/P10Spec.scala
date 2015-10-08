import org.scalatest._
import com.s99.P10


class P10Spec extends FlatSpec with Matchers  {

  "P10" should "pack consecutive members into lists containing letters and number of ocurrences" in {
    val initialList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val finalList =List((4,'a'), (1,'b'), (2,'c'), (2,'a'), (1,'d'), (4,'e'))

    P10.encode(initialList) shouldBe(finalList)
  }

}
