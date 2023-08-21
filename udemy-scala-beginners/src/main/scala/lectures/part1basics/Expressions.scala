package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)
  println(1 == x)
  println(!(1 == x))

  var someVar = 10
  someVar /= 7
  println(someVar)

  val someConditionedVal = if (true) 5 else 3
  println(someConditionedVal)


  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  val wierdVal: Unit = (someVar = 3) // This is a Unit
  println(wierdVal)

  val aCodeblock = {
    val z = 1
    val y = 2 + z

    if (y > 2) "hello world" else "goodbye"
  }
  println(aCodeblock)
}
