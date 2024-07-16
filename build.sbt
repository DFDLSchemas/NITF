name := "dfdl-nitf"
 
organization := "com.tresys"
 
version := "0.0.1"
 
libraryDependencies ++= Seq(
  "com.mitre" % "dfdl-jpeg" % "0.0.1",
)

enablePlugins(DaffodilPlugin)
