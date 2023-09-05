package lectures.part2oop

import org.w3c.dom.css.Counter

object ooBasics extends App {
  val writer = new Writer("John", "Doe", 1995)
  val writer2 = new Writer("John", "Doe", 1995)
  println(writer.fullName())

  val novel = new Novel("Shithole", 2013, writer)
  println(novel.authorAge())
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(writer2))
  println(novel.copy(2018).authorAge())

  val counter = new Counter(10)
  counter.print
  counter.increment.print
  counter.decrement(3).print
}


class Writer(firstName: String, surname: String, val year: Int) {
  def fullName(): String = s"$firstName $surname"
}

class Novel(name: String, var yearOfRelease: Int, author: Writer) {
  def authorAge(): Int = yearOfRelease - author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(newYearOfRelease: Int): Novel = Novel(name, newYearOfRelease, author)
}

class Counter(val value: Int) {
  def increment: Counter = {
    println("incrementing")
    new Counter(value + 1)
  }

  def decrement: Counter = {
    println("decrementing")
    new Counter(value - 1)
  }

  def increment(amount: Int): Counter = {
    if (amount <= 0) this
    else increment.increment(amount - 1)
  }

  def decrement(amount: Int): Counter = {
    if (amount <= 0) this
    else decrement.decrement(amount - 1)
  }

  def print: Unit = println(value)
}