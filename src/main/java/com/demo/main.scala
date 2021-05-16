package com.demo

object main {
  def main(args: Array[String]): Unit = {

    val loginCheck = NewLogin(username = "Aseed",password = "a1234",confirmPassword = "a1234");

    NormalLoginValidator.validate(loginCheck)

    LoginValidator.validate(loginCheck)
  }
}
