ThisBuild / scalaVersion := "3.4.2"

val client = project
  .in(file("client"))
  .enablePlugins(Http4sGrpcPlugin)
  .settings(
    Compile / PB.targets ++= Seq(
      // set grpc = false because http4s-grpc generates its own code
      scalapb.gen(grpc = false) -> (Compile / sourceManaged).value / "scalapb"
    ),
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-ember-client" % "0.23.29",
      "org.typelevel" %% "log4cats-slf4j" % "2.7.0",
      "ch.qos.logback" % "logback-classic" % "1.2.13"
    )
  )

val server = project
  .in(file("server"))
  .settings(
    Compile / PB.targets := Seq(
      scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
    ),
    libraryDependencies ++= Seq(
      "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
      "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
      "co.fs2" %% "fs2-core" % "3.11.0"
    )
  )

val root = project.in(file(".")).aggregate(client, server)
