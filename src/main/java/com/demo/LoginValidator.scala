package com.demo

/* pattern matching validator */

object LoginValidator {

  def validate(login : NewLogin): Unit = {
    val answer = login match {
      case NewLogin("admin",_,_) => "admin can't ba name of user"
      case NewLogin(_,pass,_) if(pass.startsWith("z")) =>  s"password is: $pass can't start with z"
      case NewLogin(userName,pass,_) if (userName == pass) => "username = pass, not good"
      case NewLogin(_,pass,_) if (pass.forall(_.isDigit))=> s"your password is: $pass contains only digits" //(pass.forall(letter => letter.isDigit))
      case NewLogin(_,pass,confirm) if (pass != confirm) => "pass and confirmation are not the same"
      case _ => "accepted" //or NewLogin(_,_,_) => "accepted"
    }

    println(answer)
  }
}
