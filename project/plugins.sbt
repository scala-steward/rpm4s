addSbtPlugin("io.get-coursier" % "sbt-coursier" % "2.0.0-RC2")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.28")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.2")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.5")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.0.0+417-35327239")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")

resolvers += Resolver.sonatypeRepo("snapshots")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0-M4")
