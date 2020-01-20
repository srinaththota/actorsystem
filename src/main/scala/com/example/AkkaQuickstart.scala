//#full-example
package com.example

import akka.actor.{Actor, ActorSystem, Props}

object ActorQuickstart extends App{
  val actorSystem=ActorSystem("firstactor")
  println(actorSystem.name)

  class WordCount extends Actor{
    var counter=0;
    override def receive: Receive ={
      case message:String =>
        println(s"i have received message $message")
        counter= message.split(" ").length;
        println(s"count is $counter")
      case msg => println("i cannot understand")
    }
  }

  val wordCounter = actorSystem.actorOf(Props[WordCount],"wordcount")

  wordCounter ! "I am learning  Akka"
}

