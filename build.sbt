val root = (project in file("."))
  .settings(
    name := "dfdl-nitf",

    organization := "com.tresys",

    version := "0.0.2",

    libraryDependencies ++= Seq(
      "com.mitre" % "dfdl-jpeg" % "0.0.1",
    )
  )
  .daffodilProject()
