package com.lectures.part3fp

object WhatsAFunction extends App {

  val stringToIntConverter = new Function[String, Int] {
    override def apply(v1: String): Int = v1.toInt
  }

  val adder = (v1: Int, v2: Int) => v1 + v2

  //anonymous function (lambda)
  val voncatenatr = (v1: String, v2: String) => v1 + v2

  println(adder(3, 5))
  println(voncatenatr("I ", "love u"))


  //syntax sugar
  // _ + 1 === x => x + 1

}
