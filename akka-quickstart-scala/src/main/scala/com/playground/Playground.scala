package com.playground

import akka.actor.ActorSystem

object Playground extends App{
  val actorSystem = ActorSystem("HelloAkka")
  println(actorSystem.name)

  val unknown = 2
  val order = unknown match {
    case 1 => "first"
    case 2 => "Second"
    case _ => "unknown"
  }



}
