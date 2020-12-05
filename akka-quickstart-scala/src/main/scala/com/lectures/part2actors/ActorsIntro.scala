package com.lectures.part2actors

import akka.actor.{Actor, ActorSystem, Props}

object ActorsIntro extends App{

  //part 1 actor systems
  val actorSystem = ActorSystem("firstActorSystem")
  println(actorSystem.name)

  //part 2 actors are uniquely identified
  // messages are asynchronous
  // each actor may respond differently
  //Actors are well encapsulated

  class WordCountActor extends Actor {

    var totalWords = 0
    override def receive: PartialFunction[Any, Unit] = {
      case message: String =>
        println(s"[word counter] I have received : $message")
        totalWords += message.split(" ").length
      case msg => println(s"[word counter] I cannot understand ${msg.toString}")
    }
  }

  //part 3 how to instantiate new actor, actor name have to be unique
  val wordCounter = actorSystem.actorOf(Props[WordCountActor], "wordCounter")
  val wordCounter2 = actorSystem.actorOf(Props[WordCountActor], "wordCounter2")

  //part 4 communicate ---    ! means "tell" is a method to communicate with actor by actorRef
  wordCounter ! "I am learning Akka and it's pretty damn cool!"
  wordCounter2 ! "A different message"
  //asynchronous


  object Person {
    def props(name: String) = Props(new Person(name))
  }
  class Person(name: String) extends Actor {
    override def receive: Receive = {
      case "hi" => println(s"Hi, my name is $name")
    }
  }
  val person =  actorSystem.actorOf(Person.props("Bob"))
  person ! "hi"
}
