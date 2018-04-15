enablePlugins(ScalaNativePlugin)

lazy val root = (project in file(".")).settings(
  name := "fiamma",
  version := "0.1",
  scalaVersion := "2.11.12"
)