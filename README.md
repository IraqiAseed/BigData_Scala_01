# BigData_Scala_01
pattern matching in scala


Lab

case classes and Objects
Declare case class NewLogin (username, password,confirmPassword)

Write LoginValidator object with method validate( login:NewLogin)

Method should print next errors:

Name can't be admin

Password can't start from z

Password can't be equal to username

Password can't contains only digits

ConfirmPassword should equal password

Only one error will be printed, even if there more than one error

The printed message should contain not only static text, but relevant object state

In case login doesn't have any problems it should be printed with accepted
