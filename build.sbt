import com.lihaoyi.workbench.Plugin._

enablePlugins(ScalaJSPlugin)

workbenchSettings

name := "scalajs-widok-template"
version := "0.1-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.github.widok" %%% "widok" % "0.2.2"
  )

bootSnippet := ""
updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

persistLauncher := true
