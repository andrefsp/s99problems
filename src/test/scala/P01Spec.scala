import org.scalatest._
import com.s99.P01

class P01Spec extends FlatSpec with Matchers {

  "p01" should "find the last element of a integer list" in {
      P01.last(List(1, 2, 3, 4)) should === (4)
  }

  "p01" should "find the last element of a char list" in {
    P01.last(List("a", "b", "c")) should === ("c")
  }

  "p01" should "find the last element of a integer sequence" in {
      P01.last(Seq(1, 2, 3, 4)) should === (4)
  }

  "p01" should "find the last element of a cgar sequence" in {
    P01.last(Seq("a", "b", "c")) should === ("c")
  }

}
