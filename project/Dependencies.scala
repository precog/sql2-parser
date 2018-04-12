package quasar.project

import scala.Boolean
import scala.collection.Seq

import sbt._

object Dependencies {
  private val argonautVersion     = "6.2"
  private val http4sVersion       = "0.16.6a"
  private val parsebackVersion    = "0.4.0-f0c3683"
  private val quasarVersion       = "38.2.3"
  private val refinedVersion      = "0.8.3"
  private val scalazVersion       = "7.2.18"


  def sql2parser = Seq(
    "com.slamdata"     %% "slamdata-predef"     % "0.0.4",
    "com.codecommit"   %% "parseback-core"      % parsebackVersion,
    "com.codecommit"   %% "parseback-render"    % "0.4.0-12dc1f4",
    "com.codecommit"   %% "parseback-scalaz-72" % "0.3",
    "org.scalaz"       %% "scalaz-core"         % scalazVersion,
    "org.scalaz"       %% "scalaz-concurrent"   % scalazVersion
  )

  def it = sql2parser ++ Seq(
    "io.argonaut"      %% "argonaut-monocle"    % argonautVersion     % Test,
    "org.http4s"       %% "http4s-blaze-client" % http4sVersion       % Test,
    "eu.timepit"       %% "refined-scalacheck"  % refinedVersion      % Test,
    "io.verizon.knobs" %% "core"                % "4.0.30-scalaz-7.2" % Test
  )
}
