package com.bol.fp

import org.scalatest.FlatSpec
import org.scalatest.Matchers
import java.io.File

class ExampleSpec extends FlatSpec with Matchers {

  "Example object" should "read first line of a file" in {
    val line = Example.readFirstLine(new File("src/test/resources/test.txt"))

    line shouldEqual Some("Hello world")
  }

  it should "not be able to read the file" in {
    Example.readFirstLine(new File("src/test/resources/empty.txt")) shouldEqual None
  }

}