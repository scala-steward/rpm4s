addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.0.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.6")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")

resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0-M4")
