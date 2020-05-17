scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.32")

addSbtPlugin("com.jsuereth"        % "sbt-pgp"               % "2.0.1")
addSbtPlugin("com.github.gseitz"   % "sbt-release"           % "1.0.13")
addSbtPlugin("com.eed3si9n"        % "sbt-unidoc"            % "0.4.3")
addSbtPlugin("com.eed3si9n"        % "sbt-buildinfo"         % "0.9.0")
addSbtPlugin("pl.project13.scala"  % "sbt-jmh"               % "0.3.7")
addSbtPlugin("org.scoverage"       % "sbt-scoverage"         % "1.6.1")
addSbtPlugin("org.scalastyle"     %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("com.typesafe.sbt"    % "sbt-git"               % "1.0.0")
addSbtPlugin("org.xerial.sbt"      % "sbt-sonatype"          % "3.9.2")
addSbtPlugin("org.scala-js"        % "sbt-scalajs"           % scalaJSVersion)
addSbtPlugin("org.tpolecat"        % "tut-plugin"            % "0.6.13")
addSbtPlugin("net.virtual-void"    % "sbt-dependency-graph"  % "0.9.2")
addSbtPlugin("org.portable-scala"  % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("com.47deg"           % "sbt-microsites"        % "1.2.1")
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.30"
