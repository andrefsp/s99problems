import org.scalatest._
import com.s99.P08


class P08Spec extends FlatSpec with Matchers  {

  "P08" should "Be able to remove repeated appearences" in  {
    val initialList = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

    val finalList = List('a, 'b, 'c, 'a, 'd, 'e)

    P08.compress(initialList) shouldBe(finalList)

  }
}
