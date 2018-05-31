package othree.aok.matchers

import org.mockito.ArgumentMatcher
import org.mockito.ArgumentMatchers.argThat

final class AnyMatcher[T](expected: T => Boolean) extends ArgumentMatcher[T] {

  override def matches(argument: T): Boolean = {
    expected(argument)
  }
}

object AnyMatcher {
  def apply[T](f: T => Boolean): T = {
    argThat(new AnyMatcher[T](f))
  }
}
