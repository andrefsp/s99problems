import org.scalatest._
import com.s99.P24


class P24Spec extends FlatSpec with Matchers {

  "P24" should "be able to generate sequences of random numbers" in  {
    val generatedList = P24.lotto(6, 49)

    generatedList.length shouldBe 6
  }

}
