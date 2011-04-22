import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

import us.troutwine.phonenumber.USPhoneNumber

class PhoneNumberSpec extends Spec with ShouldMatchers {

  describe("A USPhoneNumber") {

    it("should extract a valid number") {
      USPhoneNumber.unapply("(541) 719-8703") should be === Some("+15417198703")
    }

    it("should fail on invalid numbers") {
      USPhoneNumber.unapply("757575757575757575") should be === None
    }

  }
}
