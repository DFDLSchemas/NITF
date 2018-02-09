package com.tresys.nitf
import org.junit.Test
import org.apache.daffodil.tdml.DFDLTestSuite
import org.apache.daffodil.util.Misc

object TestNTBBaseline {
  val tdmlFile = "NTBBaseline.tdml"
  val validateTDML = true
  val validateDFDLSchema = true
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdmlFile), validateTDML, validateDFDLSchema)
  runner.setCheckAllTopLevel(true)
}

class TestNTBBaseline {
  import TestNTBBaseline._

  @Test def test_i_3001a() { runner.runOneTest("i_3001a") }
  @Test def test_i_3004g() { runner.runOneTest("i_3004g") }
  @Test def test_i_3008a() { runner.runOneTest("i_3008a") }
  @Test def test_i_3015a_parse() { runner.runOneTest("i_3015a_parse") }
  @Test def test_i_3015a_unparse() { runner.runOneTest("i_3015a_unparse") }
  @Test def test_i_3018a() { runner.runOneTest("i_3018a") }
  @Test def test_i_3025b() { runner.runOneTest("i_3025b") }
  @Test def test_i_3034c() { runner.runOneTest("i_3034c") }
  @Test def test_i_3034f() { runner.runOneTest("i_3034f") }
  @Test def test_i_3041a() { runner.runOneTest("i_3041a") }
  @Test def test_i_3051e() { runner.runOneTest("i_3051e") }
  @Test def test_i_3052a() { runner.runOneTest("i_3052a") }
  @Test def test_i_3060a() { runner.runOneTest("i_3060a") }
  @Test def test_i_3063f() { runner.runOneTest("i_3063f") }
  @Test def test_i_3068a() { runner.runOneTest("i_3068a") }
  @Test def test_i_3076a() { runner.runOneTest("i_3076a") }
  @Test def test_i_3090m() { runner.runOneTest("i_3090m") }
  @Test def test_i_3090u() { runner.runOneTest("i_3090u") }
  @Test def test_i_3113g() { runner.runOneTest("i_3113g") }
  @Test def test_i_3114e() { runner.runOneTest("i_3114e") }
  @Test def test_i_3117ax() { runner.runOneTest("i_3117ax") }
  @Test def test_i_3128b() { runner.runOneTest("i_3128b") }
  @Test def test_i_3201c() { runner.runOneTest("i_3201c") }
  @Test def test_i_3228c() { runner.runOneTest("i_3228c") }
  @Test def test_i_3228e() { runner.runOneTest("i_3228e") }
  @Test def test_i_3301a() { runner.runOneTest("i_3301a") }
  @Test def test_i_3301h() { runner.runOneTest("i_3301h") }
  @Test def test_i_3301k() { runner.runOneTest("i_3301k") }
  @Test def test_i_3303a() { runner.runOneTest("i_3303a") }
  @Test def test_i_3309a() { runner.runOneTest("i_3309a") }
  @Test def test_i_3311a() { runner.runOneTest("i_3311a") }
  @Test def test_i_3405a() { runner.runOneTest("i_3405a") }
  @Test def test_i_3430a() { runner.runOneTest("i_3430a") }
  @Test def test_i_3450c() { runner.runOneTest("i_3450c") }
  @Test def test_i_5012c() { runner.runOneTest("i_5012c") }
  @Test def test_ns3004f() { runner.runOneTest("ns3004f") }
  @Test def test_ns3005b() { runner.runOneTest("ns3005b") }
  @Test def test_ns3010a() { runner.runOneTest("ns3010a") }
  @Test def test_ns3017a_parse() { runner.runOneTest("ns3017a_parse") }
  @Test def test_ns3017a_unparse() { runner.runOneTest("ns3017a_unparse") }
  @Test def test_ns3022b() { runner.runOneTest("ns3022b") }
  @Test def test_ns3033b() { runner.runOneTest("ns3033b") }
  @Test def test_ns3034d() { runner.runOneTest("ns3034d") }
  @Test def test_ns3038a() { runner.runOneTest("ns3038a") }
  @Test def test_ns3050a() { runner.runOneTest("ns3050a") }
  @Test def test_ns3051v() { runner.runOneTest("ns3051v") }
  @Test def test_ns3059a() { runner.runOneTest("ns3059a") }
  @Test def test_ns3061a() { runner.runOneTest("ns3061a") }
  @Test def test_ns3063h() { runner.runOneTest("ns3063h") }
  @Test def test_ns3073a() { runner.runOneTest("ns3073a") }
  @Test def test_ns3090i() { runner.runOneTest("ns3090i") }
  @Test def test_ns3090q() { runner.runOneTest("ns3090q") }
  @Test def test_ns3101b() { runner.runOneTest("ns3101b") }
  @Test def test_ns3114a() { runner.runOneTest("ns3114a") }
  @Test def test_ns3114i() { runner.runOneTest("ns3114i") }
  @Test def test_ns3118b() { runner.runOneTest("ns3118b") }
  @Test def test_ns3119b() { runner.runOneTest("ns3119b") }
  @Test def test_ns3201a() { runner.runOneTest("ns3201a") }
  @Test def test_ns3228b() { runner.runOneTest("ns3228b") }
  @Test def test_ns3229b() { runner.runOneTest("ns3229b") }
  @Test def test_ns3301b() { runner.runOneTest("ns3301b") }
  @Test def test_ns3301e() { runner.runOneTest("ns3301e") }
  @Test def test_ns3301j() { runner.runOneTest("ns3301j") }
  @Test def test_ns3302a() { runner.runOneTest("ns3302a") }
  @Test def test_ns3304a() { runner.runOneTest("ns3304a") }
  @Test def test_ns3310a() { runner.runOneTest("ns3310a") }
  @Test def test_ns3361c() { runner.runOneTest("ns3361c") }
  @Test def test_ns3417c() { runner.runOneTest("ns3417c") }
  @Test def test_ns3437a() { runner.runOneTest("ns3437a") }
  @Test def test_ns3450e() { runner.runOneTest("ns3450e") }
  @Test def test_ns5600a() { runner.runOneTest("ns5600a") }

}
