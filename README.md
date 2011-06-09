PhoneNumber
===========

Google's [libphonenumber](http://code.google.com/p/libphonenumber/) is fantastic. Being that I needed a Scala [extractor](http://www.scala-lang.org/node/112) for use against phone numbers I wrote this wrapper. It has neither the feature set or the utility of the original; it's quick and easy, drop in and go.

Patches welcome.

Installation
------------

Add the following to your project description:

```
val troutwineRepo = "troutwine.us repository" at "http://maven.troutwine.us/"
val phone = "us.troutwine" %% "phonenumber" % "0.2.7"
```

Builds are available for Scala 2.9.0

Example
-------

```
scala> import us.troutwine.phonenumber.USPhoneNumber
import us.troutwine.phonenumber.USPhoneNumber

scala> "(541) 719-8703" match { case USPhoneNumber(norm) => println(norm) }
+15417198703
```

Acknowledgments
===============

This project has been an outgrowth of my work with the kind folks at
[FluentStream Technologies](http://www.fluentstream.com/).