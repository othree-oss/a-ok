package io.othree.aok

import org.scalatest._
import org.scalatest.mockito.MockitoSugar

trait BaseTest extends WordSpecLike
  with BeforeAndAfter
  with BeforeAndAfterAll
  with Matchers
  with MockitoSugar
