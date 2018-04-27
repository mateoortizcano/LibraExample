name := "LibraExample"
version := "0.1"

inThisBuild(Seq(
  scalaOrganization := "org.typelevel",
  scalaVersion      := "2.12.4-bin-typelevel-4",
  scalacOptions     += "-Yliteral-types",
  libraryDependencies += "com.github.to-ithaca" %% "libra" % "0.4.0"
))

//libraryDependencies += "com.github.to-ithaca" %% "libra" % "0.4.0"
//scalaOrganization := "org.typelevel"
//scalacOptions += "-Yliteral-types"