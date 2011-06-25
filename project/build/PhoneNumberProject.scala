import sbt._

class PhoneNumberProject(info: ProjectInfo) extends DefaultProject(info) {
  val libPhone  = "com.googlecode.libphonenumber" % "libphonenumber" % "3.5"
  val scalaTest = "org.scalatest" %% "scalatest" % "1.4.1"

  val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
  val smack = "jivesoftware" % "smack" % "3.1.0"
  val smackx = "jivesoftware" % "smackx" % "3.1.0"

  override def managedStyle = ManagedStyle.Maven
  lazy val publishTo = Resolver.sftp("troutwine.us repository", "maven.troutwine.us", "/srv/http/us/troutwine/maven/")
}
