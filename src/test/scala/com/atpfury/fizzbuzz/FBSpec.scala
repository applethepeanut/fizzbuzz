package com.atpfury.fizzbuzz

import org.scalatest.prop.TableDrivenPropertyChecks._
import org.scalatest.{Matchers, WordSpecLike}

class FBSpec extends WordSpecLike with Matchers {

  "fizzify" should {

    val ranges = Table(
      ("range", "result"),
      (0 to 0, "0"),
      (1 to 2, "1 2"),
      (1 to 3, "1 2 fizz"),
      (1 to 5, "1 2 fizz 4 buzz"),
      (1 to 6, "1 2 fizz 4 buzz fizz"),
      (1 to 20, "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz")
    )

    forAll(ranges) { (range, result) =>
      s"return '$result' given $range" in {
        FB.fizzify(range) shouldBe result
      }
    }
  }

  "multipleOf3" should {

    val numbers = Table(
      ("number", "result"),
      (0, false),
      (1, false),
      (2, false),
      (3, true),
      (4, false),
      (5, false),
      (6, true),
      (7, false),
      (8, false),
      (9, true),
      (10, false)
    )

    forAll(numbers) { (number, result) =>
      s"return $result for $number" in {
        FB.multipleOf3(number) shouldBe result
      }
    }
  }

  "multipleOf5" should {

    val numbers = Table(
      ("number", "result"),
      (0, false),
      (1, false),
      (2, false),
      (3, false),
      (4, false),
      (5, true),
      (6, false),
      (7, false),
      (8, false),
      (9, false),
      (10, true)
    )

    forAll(numbers) { (number, result) =>
      s"return $result for $number" in {
        FB.multipleOf5(number) shouldBe result
      }
    }
  }

  "multipleOf15" should {

    val numbers = Table(
      ("number", "result"),
      (0, false),
      (5, false),
      (10, false),
      (15, true),
      (20, false),
      (25, false),
      (30, true),
      (35, false)
    )

    forAll(numbers) { (number, result) =>
      s"return $result for $number" in {
        FB.multipleOf15(number) shouldBe result
      }
    }
  }

}
