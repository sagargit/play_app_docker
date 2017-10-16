name := "play_app"

version := "1.0"

lazy val `play_app` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

enablePlugins(JavaAppPackaging)

dockerExposedPorts in Docker := Seq(9000, 9443)