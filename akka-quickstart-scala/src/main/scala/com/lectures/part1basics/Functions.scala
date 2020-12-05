package com.lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String =
    a + " " + b

  println(aFunction("Hello", 25))


  def bFunction(): Int = 42
  println(bFunction)

  //WHEN NEED LOOP, USE RECURSION
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("Haha ", 3))


  def cFunctionWithSideEffects(sString: String): Unit = {
    println("sString")
  }

  cFunctionWithSideEffects("Fuck")

  def greetingChildren(name: String, age: Int): Unit = {
    println(s"Hi, my name is $name, and my age is $age")
  }

  greetingChildren("Miao", 25)

  def factorail(n: Int): Int = {
    if (n == 1) n
    else n * factorail(n - 1)
  }
  println(factorail(5))


  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 19))


}
