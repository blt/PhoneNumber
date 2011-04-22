import sbt._

class PhoneNumberProject(info: ProjectInfo) extends DefaultProject(info) {
  val libPhone  = "com.googlecode.libphonenumber" % "libphonenumber" % "3.2"
  val scalaTest = "org.scalatest" % "scalatest" % "1.3"
}
