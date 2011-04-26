import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

import us.troutwine.phonenumber.USPhoneNumber

class PhoneNumberSpec extends Spec with ShouldMatchers {

  describe("A USPhoneNumber") {

    it("should extract a valid number") {
      new USPhoneNumber("(541) 719-8703") should be === new USPhoneNumber("+15417198703")
      new USPhoneNumber("(541) 719-8703") should be === "+15417198703"
    }

    it("should fail on invalid numbers") {
      intercept[com.google.i18n.phonenumbers.NumberParseException] {
        new USPhoneNumber("757575757575757575")
      }
    }

  }
}
