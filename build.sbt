val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(

    name := "learn-scala",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.4.8",
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "com.lihaoyi" %% "requests" % "0.8.0",
      "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
      )

    // enablePlugins(JavaAppPackaging)
    // enablePlugins(DockerPlugin)
  )
