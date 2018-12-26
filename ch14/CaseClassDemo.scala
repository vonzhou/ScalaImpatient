// https://docs.scala-lang.org/tour/case-classes.html
case class Book(isbn: String)

val frankenstein = Book("978-0486282114")

case class Message(sender: String, recipient: String, body: String)

val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

println(message1.sender) // prints guillaume@quebec.ca
//message1.sender = "travis@washington.us"  // this line does not compile


case class Message2(sender: String, recipient: String, body: String)

val message4 = Message2("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
message5.sender // travis@washington.us
message5.recipient // claire@bourgogne.fr
message5.body // "Me zo o komz gant ma amezeg"