package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {
  def concatN(text: String, n: Int): String = {
    @tailrec
    def concatNHelper(text: String, n: Int, accumulator: String): String = {
      if (n == 1) accumulator
      else concatNHelper(text, n - 1, accumulator + text)
    }

    concatNHelper(text, n, "")
  }

  println(concatN("Hello sunshine", 8))

  def isPrime(n: Int): Boolean = {
    val limit: Int = math.sqrt(n.toDouble).toInt

    @tailrec
    def isPrimeHelper(d: Int, acc: Boolean): Boolean = {
      if ((d < limit) || (d < 3)) acc
      else if (!acc) acc
      else isPrimeHelper(d - 1, n % d != 0)
    }

    isPrimeHelper(n - 1, true)
  }


  println(isPrime(1))
  println(isPrime(2))
  println(isPrime(13))
  println(isPrime(95))
  println(isPrime(25))
  println(isPrime(29))


  def fib(n: Int): BigInt = {
    def fibHelper(n: Int, ac1: BigInt, ac2: BigInt): BigInt = {
      if (n <= 1) ac1 + ac2
      else fibHelper(n - 1, ac2, ac1 + ac2)
    }

    fibHelper(n, 0, 1)
  }


  println(fib(1))
  println(fib(2))
  println(fib(3))
  println(fib(4))
  println(fib(5))
  println(fib(6))

  println(fib(3000))
}
