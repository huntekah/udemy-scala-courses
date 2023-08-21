package lectures.part1basics

object Functions extends App {

  def greet(name: String, age: Int): Unit = println(s"Name $name Age: $age")

  def factorial(n: Int): Int = {
    if (n == 0) 1
    else n * factorial(n - 1)
  }

  def fib(n: Int): Int = {
    n match
      case 1 => 1
      case 2 => 1
      case _ => fib(n - 1) + fib(n - 2)
  }

  def isPrime(n: Int): Boolean = {
    if (n <= 3) {
      n > 1
    }
    else if ((n % 2 == 0) && (n % 3 == 0)) {
      false
    }
    else {
      Range(5, math.sqrt(n.toDouble).toInt + 1, 6).map(x => if ((n % x == 0) || (n % x + 2 == 0)) 1 else 0).sum == 0
    }
  }

  greet("Programmer", 99)
  println(factorial(5))
  println(fib(6))
  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(13))
  println(isPrime(95))
}
