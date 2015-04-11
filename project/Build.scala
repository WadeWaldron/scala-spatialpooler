import sbt._
import sbt.Keys._

object SpatialPoolerBuild extends Build {

  object Versions {
    val scala = "2.11.6"    
    val scalatest = "2.2.4" 
    val rxscala = "0.24.1"
  }

  val root = Project("root",file("."), settings = Defaults.defaultSettings ++ Seq(
	  scalaVersion := Versions.scala,
    libraryDependencies ++= Seq(
	  "io.reactivex" %% "rxscala" % Versions.rxscala,
      "org.scalatest" %% "scalatest" % Versions.scalatest % "test"
    )
  ))
}