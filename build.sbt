name := "scalatraServer"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.7.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.4.30.v20200611"
)