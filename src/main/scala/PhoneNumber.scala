package us.troutwine.phonenumber

import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat

object USPhoneNumber {
  val phoneUtil:PhoneNumberUtil = PhoneNumberUtil.getInstance()

  implicit def phoneToString(num:USPhoneNumber):String =
    phoneUtil.format(num.proto, PhoneNumberFormat.E164)
  implicit def stringToPhone(num:String):USPhoneNumber = new USPhoneNumber(num)
}

class USPhoneNumber(number:String) {
  import USPhoneNumber.phoneUtil

  private val proto = phoneUtil.parse(number, "US")
  require( phoneUtil.isValidNumber(proto) )

  override def toString = phoneUtil.format(proto, PhoneNumberFormat.E164)

  override def equals(other:Any):Boolean = other match {
    case that:USPhoneNumber =>
      (that canEqual this) &&
      ((this:String) equalsIgnoreCase (that:String))
    case that:String =>
      (this:String) equalsIgnoreCase ((new USPhoneNumber(that)):String)
    case _ =>
      false
  }
  def canEqual(other: Any):Boolean = other.isInstanceOf[USPhoneNumber]

  override def hashCode = (this:String).hashCode
}

