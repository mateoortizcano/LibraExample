name := "LibraExample"
version := "0.1"
scalaVersion := "2.12.4"
libraryDependencies += "com.github.to-ithaca" %% "libra" % "0.3.0"
lazy val buildSettings = Seq(
  scalaOrganization := "org.typelevel",
  scalacOptions += "-Yliteral-types"
)
