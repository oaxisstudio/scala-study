import scala.math.sqrt

object Factorization extends App {
  var target = 90
  // 割る数の最大値
  var maxDivisor = sqrt(target).toInt

  // 対象
  var num = 24;
  // 割る数
  var divisor = 0;
  // 結果
  var acc = 0;
  def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
    if(divisor > maxDivisor) {
      if (num == 1) acc else acc + (num -> 1)
    } else if (num % divisor == 0) {
      val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
      factorizationRec(num/divisor, divisor, nextAcc)
    } else {
      factorizationRec(num, divisor + 1, acc)
    }
  }

  println(factorizationRec(target, 2, Map()))
}

