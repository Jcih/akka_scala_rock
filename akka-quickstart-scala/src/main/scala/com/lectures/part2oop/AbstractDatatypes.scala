package com.lectures.part2oop

object AbstractDatatypes extends App {
  // abstract
  //not instantiatable
  abstract class Animal {
    val creaturetype: String //not implemented
    def eat: Unit // not implemented
  }

  class Dog extends Animal {
    override val creaturetype: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }

  //trait, can be inherited
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creaturetype: String = "croc"

    override def eat: Unit = "nomnom"

    override def eat(animal: Animal): Unit = s"I am a croc and I am eating ${animal.creaturetype}"
  }


  //traits vs abstract class
  /*
  * abstract classes can have both abstract and non-abstract members
  * trait cann't have constructor parameters
  * One class can only inherite one abstract class, but multiple traits
  * traits are behaviour
  *
  *
  * */
}
