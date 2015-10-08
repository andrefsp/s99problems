import org.scalatest._
import com.s99.P09


class P09Spec extends FlatSpec with Matchers  {

  "P09" should "pack consecutive memever into lists" in {
    val initialList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val finalList = List(List('a', 'a', 'a', 'a'),
                         List('b'),
                         List('c', 'c'),
                         List('a', 'a'),
                         List('d'),
                         List('e', 'e', 'e', 'e'))

    P09.pack(initialList) shouldBe(finalList)
  }


}
