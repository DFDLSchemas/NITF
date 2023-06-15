package com.tresys.nitf

import org.junit.AfterClass
import org.junit.Test
import org.apache.daffodil.tdml.Runner

object TestCustomMetadata {
  lazy val runner = Runner("/custom_metadata.tdml")
  @AfterClass def shutdown(): Unit = { runner.reset }
}

class TestCustomMetadata {
  import TestCustomMetadata._

  @Test def test_custom_01() { runner.runOneTest("custom_01") }
  
}
