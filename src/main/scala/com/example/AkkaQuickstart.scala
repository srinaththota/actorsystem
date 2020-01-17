//#full-example
package com.example

import akka.actor.ActorSystem

object ActorQuickstart extends App{
  val actorSystem=ActorSystem("firstactor")
  println(actorSystem.name)
}

