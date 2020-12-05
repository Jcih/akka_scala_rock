package com.lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // Expression

  println(x)
  println(x != 3)

  var aVariable = 2
  aVariable += 3 // change a variable is side effections

  println(aVariable)
  // Instructions (DO) vs Expressions (VALUE)

  //If expression
  val aCondition = false
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // everything in Scala is an Expression
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  //code block
  val aCodeBlock = {
    val y = 0
    val z = y + 1
    if (z > 1) "Hello" else "Fuck"
  }

  println(aCodeBlock)

  val someValue = {
    3 < 4
    43
  }
  println(someValue)
}
