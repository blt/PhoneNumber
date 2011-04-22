package us.troutwine.phonenumber

import com.google.i18n.phonenumbers.PhoneNumberUtil
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat

object USPhoneNumber {
  protected val phoneUtil:PhoneNumberUtil = PhoneNumberUtil.getInstance()

  def unapply(number:String): Option[String] = {
    try {
      val smsIdProto = phoneUtil.parse(number, "US")
      Some(phoneUtil.format(smsIdProto, PhoneNumberFormat.E164))
    } catch {
      case npe:com.google.i18n.phonenumbers.NumberParseException => None
    }
  }
}
