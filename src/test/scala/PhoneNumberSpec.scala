import org.scalatest.Spec
import org.scalatest.matchers.ShouldMatchers

import us.troutwine.phonenumber.USPhoneNumber

class PhoneNumberSpec extends Spec with ShouldMatchers {

  describe("A USPhoneNumber") {

    it("should extract a valid number") {
      val num0 = new USPhoneNumber("(541) 719-8703")
      num0 should be === new USPhoneNumber("+15417198703")
    }

    it("should fail on invalid numbers") {
      intercept[com.google.i18n.phonenumbers.NumberParseException] {
        new USPhoneNumber("757575757575757575")
      }
    }

    it("should understand a difference between numbers") {
      val num0 = new USPhoneNumber("5859537915")
      val num1 = new USPhoneNumber("8167186838")
      assert( !(num0 == num1) )
    }

    it("should be able to handle itself") {
      val num0 = new USPhoneNumber("5859537915")
      val nums:String = num0
      val num1 = new USPhoneNumber(nums)
      assert( num0 == num1 )
    }

    it("should correctly format into a string") {
      val num0 = new USPhoneNumber("5859537915")
      val nums:String = "%s".format(num0)
      val num1 = new USPhoneNumber(nums)
      assert( num0 == num1 )
    }
  }
}
