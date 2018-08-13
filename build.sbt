organization := "com.tresys"

name := "dfdl-nitf"

version := "0.0.1"

crossPaths := false

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

libraryDependencies in ThisBuild := Seq(
  "com.mitre" % "dfdl-jpeg" % "0.0.1",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.daffodil" %% "daffodil-tdml" % "2.2.0-SNAPSHOT" % "test"
)

retrieveManaged := true

exportJars in ThisBuild := true

exportJars in Test in ThisBuild := true

publishArtifact in Test := true

