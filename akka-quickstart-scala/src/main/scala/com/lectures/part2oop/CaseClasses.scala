package com.lectures.part2oop

object CaseClasses extends App {
  case class Person(name: String, age: Int)

  val jim = new Person("Jim", 24)
  println(jim.name)

  println(jim.toString)

  val jim2 = jim.copy(age = 60)
  println(jim2)

  //case class has companian class
  val thePerson = Person

  val mary = Person("mary", 34)

  // case class are serializable
  // akka

  // case class have extractor patterns

  case object UnitedKindom {
    def name: String = "The UK of GB"
  }

}
