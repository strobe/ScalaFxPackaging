name := """ScalaFxPackaging"""

version := "1.0"

scalaVersion := "2.11.5"

// Add dependency on ScalaFX library
libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.40-R8"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

enablePlugins(JDKPackagerPlugin)

jdkPackagerType := "dmg"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.9"

