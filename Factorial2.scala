import scala.math.BigInt

  object Factorial2 extends App {
    def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0 ) acc else factorial(i - 1, i * acc)
    println(factorial(100000, 1))
  }