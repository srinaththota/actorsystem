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
