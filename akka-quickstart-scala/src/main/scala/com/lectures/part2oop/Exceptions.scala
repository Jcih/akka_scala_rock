package com.lectures.part2oop

object Exceptions extends App {

  val x: String = null
  //println(x.length)

  //this will crash with a NullPointerException

  //throwing and catching exceptions
  //val aWeirdValur = throw new NullPointerException

  //throwable classed entend the Throwable class
  //Exception and Error are the major Throwable subtypes

  //how to catch scala exceptions
  def getInt(withExceptions: Boolean): Int =
    if (withExceptions) throw new RuntimeException("No int for you")
    else 42


  try {
    //code that might throw
    getInt(true)
  } catch {
    case e: RuntimeException => println("caught a Runtime exception")
  } finally {
    //code that will get executed no matter what
    println("finally")
  }

  //how to define your own exceptions
  class MyException extends Exception
  val exception = new MyException

  //throw exception

  //throw new OutOfMemoryError("Out of Memorry")
  throw new StackOverflowError("StackOverFlow")


}
