name := "BigData_MovieRecommendation"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.1"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

libraryDependencies += "org.apache.spark" % "spark-mllib_2.10" % "1.1.0"