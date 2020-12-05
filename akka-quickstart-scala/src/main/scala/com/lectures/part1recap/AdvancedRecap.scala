package com.lectures.part1recap

import scala.concurrent.Future

object AdvancedRecap extends App{
  // partial functions
  val partialFunction: PartialFunction[Int, Int] = {
    case 1 => 42
    case 2 => 65
    case 5 => 999

  }

  val pf = (x: Int) => x match {
    case 1 => 42
    case 2 => 65
    case 5 => 999
  }
  // todo

  import scala.concurrent.ExecutionContext.Implicits.global
  val future = Future {
    println("Hello Future!")
  }



}
