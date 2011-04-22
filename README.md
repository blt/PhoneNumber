PhoneNumber
===========

Google's [libphonenumber](http://code.google.com/p/libphonenumber/) is fantastic. Being that I needed a Scala [extractor](http://www.scala-lang.org/node/112) for use against phone numbers I wrote this wrapper. It has neither the feature set or the utility of the original; it's quick and easy, drop in and go.

Patches welcome.

Example
-------

```
scala> import us.troutwine.phonenumber.USPhoneNumber
import us.troutwine.phonenumber.USPhoneNumber

scala> "(541) 719-8703" match { case USPhoneNumber(norm) => println(norm) }
+15417198703
```