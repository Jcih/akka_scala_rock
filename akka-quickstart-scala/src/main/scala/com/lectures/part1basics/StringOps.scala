package com.lectures.part1basics

object StringOps extends App {

  val str: String = "Hello I am learning scala"

  println(str.charAt(2))
  println(str.split(" ").toList)

  val aNumberStr = "45"
  val aNumber = aNumberStr.toInt

  println('a' +: aNumberStr :+ 'p')
  // s - interpolators
  val name = "David"
  val age = 12
  val greeting = s"hello , my name is $name and I am $age years old"
  val anathergreeting = s"my name is ${name + "Shit"} and I am ${age + 20} old."
  println(anathergreeting)

  // f - interpolator
  val speed = 1.3f
  val myth = f"$name can eat $speed%2.4f burgers per minute"
  println(myth)

  // raw - interpolator
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
