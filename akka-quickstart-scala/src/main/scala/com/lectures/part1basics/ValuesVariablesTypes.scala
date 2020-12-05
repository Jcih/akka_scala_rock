package com.lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)

  // vals are immutable

  val y = 40
  println(y)

  // compiler can infer types
  val h = "Hello String"
  println(h)

  val aChar: Char = 'a'
  val aBoolean: Boolean = false
  val anInt: Int = y
  val aShortL: Short = 4613
  val aLong: Long = 8888888888L
  val aFloat: Float = 2.0f
  val aDouble: Double = 2.9


  //variables
  var aVariable: Int = 4
  aVariable = 5 // side effects




}
