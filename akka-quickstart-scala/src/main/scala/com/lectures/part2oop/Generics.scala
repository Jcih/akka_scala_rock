package com.lectures.part2oop

object Generics extends App {
  class MyList[A] {

    def add[B >: A] (element: B): MyList[B] = ???// B is super class of A


  }// A in [] is generic type

  class MyMap[K, V]


  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //generic method
  object MyList {
    def empty[A]: MyList[A] = ???

  }
  val emptyListOfIntegers = MyList.empty[Int]

  //variance
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  //animalList.add(new Dog)

  //INVARIANCE
  class InvariantList[A]
  val invariantAnimalList: InvariantList[Animal] = new InvariantList[Animal]

  //CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]


  //bounded types
  class Cage[A <: Animal] (animal: A)//Class Cage only accepts type parameters A which is sub types of Animal
  val cage = new Cage(new Dog)



  //expand MyList


}
