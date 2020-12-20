package com.lectures.part1basics

import akka.routing.RoundRobinGroup

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else return n * factorial(n - 1)

  println(factorial(5))
  // TAIL recursion

  // tail recursive: use recursive call as the last expression

  def tailFactorail(n: Int): BigInt = {
    @tailrec //tail recursive
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  //when you need loops, use _TAIL_ RECURSION
  //1. Concatenate a string n times
  def concatenateTailRec(aString: String, n: Int): String = {
    @tailrec
    def helper(aString: String, n: Int, accumulator: String): String = {
      if (n == 0) accumulator
      else helper(aString, n - 1, aString + accumulator)
    }
    helper(aString, n, "")
  }

  println(concatenateTailRec("Miao, I love you.\n", 3))



}
