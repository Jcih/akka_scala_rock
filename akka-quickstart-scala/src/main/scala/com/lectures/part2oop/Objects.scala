package com.lectures.part2oop

object Objects extends App {
  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY "static"

  //objects do not reveive parameters
  object Person { // its only instance and Person Type
    val N_EYES = 2

    //factory method to build persons by given parameters
    def apply(mom: String, dad: String): Person = new Person("Bobbie")
  }
  class Person (val name: String) {
    //instance-level fuunctionality
  }
  //COMPANIONS

  println(Person.N_EYES)

  //scala object = singleton instance

  //call Person object apply function
  val bobbie = Person("mary", "john")

  //Scala Application == Scala object with
  //def main(args: Array[String]): Unit


}
