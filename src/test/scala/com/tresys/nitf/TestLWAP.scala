package com.tresys.nitf
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite
import org.apache.daffodil.util.Misc

object TestLWAP {
  val tdmlFile = "lwap.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestLWAP {
  import TestLWAP._

  @Test def test_lwap_01() { runner.runOneTest("lwap_01") }
  
}
