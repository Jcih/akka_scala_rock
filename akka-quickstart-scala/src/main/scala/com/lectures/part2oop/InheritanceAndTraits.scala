package com.lectures.part2oop

object InheritanceAndTraits extends App {


  //single class inheritance, you can extends only one class at a time
  //super class of cat
  class Animal {
    //default is public
    //protected allows access in the sub class, not accessible outside
    def eat = println("nomnomnom")
  }
  //sub class of animal
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }
  val cat = new Cat

  //Constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 1)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person("Danny")

  class Dog extends Animal {
    override def eat: Unit = println("crunch crunch")
  }
  val dog = new Dog
  dog.eat

  //preventing override , use keyword final on member
  // use keyword final on class, prevent the class extendable
  // seal the class== extend classes in this file only , "sealed", use when we know only limited classes
  // can extend in this file, no other classes will extend this class



}
