package com.knoldus.interns.assignment4

/**
  * Created by knoldus on 18/1/17.
  */
class TiffinWala {



  def calculate(amount:Double, method: String):Double={
    val instance = TiffinWalaCase("paytm", "freecharge", "netbanking", "card", "cash")
    method match{
      case instance.payTM =>amount*1.02
      case instance.freeCharge => amount*1.02
      case instance.netBanking=> amount+5
      case instance.card => amount+1.5
      case instance.cash=> amount
      case _ => -1
    }

  }


}
