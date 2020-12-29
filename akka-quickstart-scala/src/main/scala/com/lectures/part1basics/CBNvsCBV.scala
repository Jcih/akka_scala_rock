package com.lectures.part1basics

object CBNvsCBV extends App {

  // param is desided before function is called
  def calledByValue(x: Long): Unit = {
    println("Bu value: " + x)
    println("Bu value: " + x)

  }

  // => param is evaluated at every use within
  def calledByName(x: => Long): Unit = {
    println("By name: " + x)
    println("By name: " + x)
  }

  calledByName(System.nanoTime())
  calledByValue(System.nanoTime())

}
