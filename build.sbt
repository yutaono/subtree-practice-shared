lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val util = (project in file("util"))
  .settings(commonSettings: _*)
