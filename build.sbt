import sbt.Keys._
import sbt._
import slick.driver.MySQLDriver

lazy val commonSettings = Seq(
  organization := "com.tsukaby",
  version := "0.1.0",
  scalaVersion := "2.11.8"
)

lazy val slickGeneratorSettings = slickCodegenSettings ++ Seq(
  sourceGenerators in Compile <+= slickCodegen,
  slickCodegenDatabaseUrl := "jdbc:mysql://localhost:3306/slick_gen_example",
  slickCodegenDatabaseUser := "root",
  slickCodegenDatabasePassword := "",
  slickCodegenDriver := MySQLDriver,
  slickCodegenJdbcDriver := "com.mysql.jdbc.Driver",
  slickCodegenOutputPackage := "com.tsukaby.slick",
  slickCodegenExcludedTables in Compile := Seq("schema_version")
)

lazy val root = (project in file("."))
  .settings(commonSettings: _*)
  .settings(slickGeneratorSettings: _*)
  .settings(
    name := "slick-gen-example",
    libraryDependencies ++= {
      Seq(
        "com.typesafe.slick" %% "slick" % "3.1.1",
        "com.typesafe.slick" %% "slick-hikaricp" % "3.1.1",
        "com.github.tototoshi" %% "slick-joda-mapper" % "2.1.0",
        "joda-time" % "joda-time" % "2.7",
        "org.joda" % "joda-convert" % "1.7"
      )
    }
  )