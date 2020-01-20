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

      case SpecialMessage(contents)=>println(s"got message from case class $contents")
      case number:Int => println(s"i got numnber $number")
      case msg => println("i cannot understand")


    }
  }

  val wordCounter = actorSystem.actorOf(Props[WordCount])
  val wordCounter2 = actorSystem.actorOf(Props[WordCount])

  wordCounter ! "I am learning  Akka"
  wordCounter2 ! "I want to learn"

  case class SpecialMessage(contents:String)
  class Person(name:String) extends Actor{
    override def receive: Receive = {
      case "Hi"=>println("Print something")
    }
  }

  val personActor = actorSystem.actorOf(Props(new Person("sri")),"person");
  personActor ! "Hi"

  wordCounter2 ! SpecialMessage("some special message")
  wordCounter2 ! 50
}

