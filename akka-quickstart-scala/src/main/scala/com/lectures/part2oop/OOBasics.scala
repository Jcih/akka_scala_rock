package com.lectures.part2oop

object OOBasics extends App {
  val author = new Writer("Miao", "Hong", 1995)
  val novel = new Novel("Clean Code", 2020, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(author.fullName)

  val counter = new Counter()
  counter.inc.print
  counter.inc(5).print

}


//val makes the argument as a field of class, a member of class
class Writer(firstName: String, lastName: String, val year: Int) {
  def fullName: String = firstName + " " + lastName
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}


class Counter(val count: Int = 0) {
  def inc = new Counter(count + 1) // immutability
  def dec = new Counter(count - 1)

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n - 1)

  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n - 1)
  }
  def print = println(count)

}


