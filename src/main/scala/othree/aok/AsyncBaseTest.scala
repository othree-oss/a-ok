package othree.aok

import org.scalatest._
import org.scalatest.mockito.MockitoSugar

trait AsyncBaseTest extends AsyncWordSpecLike
with BeforeAndAfter
with BeforeAndAfterAll
with Matchers
with MockitoSugar {

}
