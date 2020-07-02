package com.tresys.nitf
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite
import org.apache.daffodil.util.Misc

object TestRaster {
  val tdmlFile = "raster.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestRaster {
  import TestRaster._

  @Test def test_gnc5M_toc() { runner.runOneTest("gnc5M_toc") }
  
}
