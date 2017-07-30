package com.atpfury.fizzbuzz

import scala.annotation.tailrec

object FB {

  def fizzify(range: Range): String = {

    @tailrec
    def buzzify(index: Int, acc: List[String]): List[String] = index match {
      case n if n > range.last => acc
      case n if multipleOf15(n) => buzzify(index + 1, "fizzbuzz" :: acc)
      case n if multipleOf5(n) => buzzify(index + 1, "buzz" :: acc)
      case n if multipleOf3(n) => buzzify(index + 1, "fizz" :: acc)
      case _ => buzzify(index + 1, index.toString :: acc)
    }
    buzzify(range.head, List.empty).reverse.mkString(" ")
  }

  private val multipleOf = (a: Int, n: Int) => a % n == 0

  private[fizzbuzz] def multipleOf3(n: Int) = n > 0 && multipleOf(n, 3)

  private[fizzbuzz] def multipleOf5(n: Int) = n > 0 && multipleOf(n, 5)

  private[fizzbuzz] def multipleOf15(n: Int) = n > 0 && multipleOf(n, 15)

}
