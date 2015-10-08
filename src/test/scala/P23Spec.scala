import org.scalatest._
import com.s99.P23


class P23Spec extends FlatSpec with Matchers {

  "P23" should "allow to pick N random elements from list" in  {
    val initialList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val finalList = P23.randomSelect(3, initialList)
    finalList.length shouldBe 3
    finalList.map((x: Any) => initialList.count((z: Any) => z == x) shouldBe 1)
  }
}
