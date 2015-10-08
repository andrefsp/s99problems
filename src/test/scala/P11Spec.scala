import org.scalatest._
import com.s99.P11


class P11Spec extends FlatSpec with Matchers  {

  "P11" should "pack eleement into (val, char) when multiple occurences" in {
    val initialList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val finalList = List((4,'a'), 'b', (2,'c'), (2,'a'), 'd', (4,'e'))

    P11.encodeModify(initialList) shouldBe(finalList)
  }
}
