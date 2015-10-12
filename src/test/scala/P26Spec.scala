import org.scalatest._
import com.s99.P26

class P26Spec extends FlatSpec with Matchers  {

  "P26" should "" in {
    val list = List.range(0, 5).map(x => (x + 97).asInstanceOf[Char])

    println(P26.combinations(2, list))

    P26.combinations(2, list).length shouldBe 10
  }
}
