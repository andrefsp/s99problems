import org.scalatest._
import com.s99.P07

/**
 * Created by andrefsp on 01/10/15.
 */
class P07Spec extends FlatSpec with Matchers  {

  "P07" should "be able to flatten as list of structures" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe(List(1, 1, 2, 3, 5, 8))
  }

}
