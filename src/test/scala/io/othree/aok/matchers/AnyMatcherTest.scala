package io.othree.aok.matchers

import io.othree.aok.BaseTest
import org.junit.runner.RunWith
import org.mockito.Mockito._
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AnyMatcherTest extends BaseTest {

  "AnyMatcher" when {
    "validating if argument matches the condition" must {
      "execute the passed logic" in {
        val matcher = new AnyMatcher[Int](value => value == 0)

        matcher.matches(1) shouldBe false
        matcher.matches(0) shouldBe true
      }
    }

    "calling the apply method" must {
      "create the argument matcher" in {
        trait TestTrait {
          def someMethod(argument : Int) : Unit
        }

        val testTraitMock = mock[TestTrait]
        testTraitMock.someMethod(1)

        verify(testTraitMock, times(1)).someMethod(AnyMatcher((value: Int) => value == 1))
      }
    }
  }
}
