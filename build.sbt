lazy val root = (project in file(".")).settings(
  name := "fiamma",
  version := "0.1",
  scalaVersion := "2.12.4",
  libraryDependencies ++= Seq(
    "com.googlecode.lanterna" % "lanterna" % "3.0.0",
  ),
)