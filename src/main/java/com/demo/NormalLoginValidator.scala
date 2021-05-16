package com.demo


/* normal validator without pattern matching*/


object NormalLoginValidator {
  def validate(login:NewLogin) : Unit =
  {
    var answer ="accepted";

    if(login.username == "admin")
      answer = "admin can't ba name of user"

    else if(login.password.startsWith("z"))
      answer = s"password is: ${login.password} can't start with z"

    else if(login.password == login.username) //not using equals in scala, use ==
      answer = "username = pass, not good"

    else if(login.password.count(_.isDigit) == login.password.length)
      answer = s"your password is: ${login.password} contains only digits"

    else if(login.password != login.confirmPassword)
      answer = "pass and confirmation are not the same"

    println(answer)
  }
}
