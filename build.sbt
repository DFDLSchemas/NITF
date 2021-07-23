name := "dfdl-nitf"
 
organization := "com.tresys"
 
version := "0.0.1"
 
scalaVersion := "2.12.11"
 
libraryDependencies ++= Seq(
  "com.mitre" % "dfdl-jpeg" % "0.0.1",
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.1.0" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "junit" % "junit" % "4.12" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false
