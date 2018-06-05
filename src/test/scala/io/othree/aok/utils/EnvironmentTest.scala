package io.othree.aok.utils

import io.othree.aok.{BaseTest, Environment}
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EnvironmentTest extends BaseTest {

  "Environment" when {
    "calling setEnv" must {
      "modify the environment variables and add the provided one" in {
        Environment.setEnv("VARIABLE", "value")

        val value = scala.util.Properties.envOrNone("VARIABLE")

        value shouldBe Some("value")
      }
    }
  }
}
