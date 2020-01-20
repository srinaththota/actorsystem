# actorsystem

val actorSystem=ActorSystem("somename");  // some name can be alphanumeric but cannot contain characters
1)Actors are uniquely identified
2)Messages are Asunchronous
3)Each actor may respond 
4)Actors are encapsulated

example: word count actor

class WordCountActor extends Actor{
****
}

we cannot create actor with new keyword

all actors should have unique name

we create actor using actorOf(Props[ActorName],"unique-name-to-identify-actor")

------------
we can instantiate actor which has constructor arguments 
class Person(name:String) extends Actor{
override def receive:Receive={

}
}

person=actorSystem.actorOf(Props[new Person("args")])

-------------
to create actor with arguments best practice is to create companion object

object Person{
def methName = Props(new Person("args"))
}
class Person(name:String){

}
---------------------------------------
Actor capabilities

we can also send messages with method
ex: specialMessages(content:String)  // it should be immutable , it should be serializable

-----------------------------------
we have keyword context where we can use it as this in java (context.self-->this in java)
