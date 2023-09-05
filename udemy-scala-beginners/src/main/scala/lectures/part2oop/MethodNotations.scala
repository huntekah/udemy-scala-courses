package lectures.part2oop
package scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, age: Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(function: String): Person = Person( s"${this.name} (${function})", favoriteMovie, age)
    def unary_! : String = s"$name, exclamation point!"
    def unary_+ : Person = new Person(name, favoriteMovie, age+1)
    def isAlive : Boolean = true
    def learns(what: String): String = f"${name} learns ${what}"
    def learnsScala(): String = this.learns("Scala")
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = f"${this.name} watched ${favoriteMovie} ${n} times"
    def print():String = f"$name, $favoriteMovie, $age"
  }
  val mary = new Person("Mary", "inception")
  val tom = new Person("Tom", "Shit")

  println(mary.likes("Shit"))
  println(tom.likes("Shit"))
  println(tom likes "Shit")

  println(mary + tom)
  println(!mary)
  println(mary.isAlive)
//  println( mary isAlive )
  println(mary.apply())
  println(mary())
  println(mary(2))
  println((+mary).print())
  println((mary + "Shit)").print())
  println(mary.learnsScala())
//  println(mary learnsScala )
}
