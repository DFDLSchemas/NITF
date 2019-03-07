package com.tresys.nitf
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite
import org.apache.daffodil.util.Misc

object TestCustomMetadata {
  val tdmlFile = "custom_metadata.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestCustomMetadata {
  import TestCustomMetadata._

  @Test def test_custom_01() { runner.runOneTest("custom_01") }
  
}
