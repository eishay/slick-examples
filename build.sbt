organization := "com.typesafe"

name := "slick-examples"

version := "1.0.0-RC1"

scalaVersion := "2.10.0"

scalacOptions += "-deprecation"

libraryDependencies ++= List(
  "com.typesafe" %% "slick" % "1.0.0-RC1",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.3.170",
  "org.xerial" % "sqlite-jdbc" % "3.6.20"
/*
  "org.apache.derby" % "derby" % "10.6.1.0",
  "org.hsqldb" % "hsqldb" % "2.0.0",
  "postgresql" % "postgresql" % "8.4-701.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.13"
*/
)
