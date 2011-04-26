package us.troutwine.phonenumber

import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat

class USPhoneNumber(number:String) {
  private val phoneUtil:PhoneNumberUtil = PhoneNumberUtil.getInstance()
  private val proto = phoneUtil.parse(number, "US")
  require( phoneUtil.isValidNumber(proto) )

  implicit def phoneToString(num:USPhoneNumber):String = {
    phoneUtil.format(proto, PhoneNumberFormat.E164)
  }

  override def equals(other:Any) = other match {
    case that:USPhoneNumber =>
      (this:String) equals (that:String)
    case that:String =>
      (this:String) equals ((new USPhoneNumber(that)):String)
    case _ => false
  }

  override def hashCode = (this:String).hashCode
}

