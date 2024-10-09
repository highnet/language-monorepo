val scala3Version = "3.5.1"

// Set the project root to the parent directory
ThisBuild / baseDirectory := file("..").getAbsoluteFile

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello-world",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    
    // Keep other build-related directories in the current folder
    target := file(".") / "target",
    bloopConfigDir := file(".") / ".bloop",
    
    // Metals will use the parent directory for .metals
    semanticdbTargetRoot := baseDirectory.value / "target" / "scala-3.5.1" / "meta"
  )

Global / onChangedBuildSource := ReloadOnSourceChanges