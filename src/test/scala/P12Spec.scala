import org.scalatest._
import com.s99.P12

class P12Spec extends FlatSpec with Matchers {

  "P12.createList" should "crate lists" in {

    P12.createList(3, 'a') shouldBe List('a', 'a', 'a')
  }


  "P12" should "decoe values of a list" in {
    val initialList = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
    val finalList = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

    P12.decode(initialList) shouldBe finalList
  }


}
