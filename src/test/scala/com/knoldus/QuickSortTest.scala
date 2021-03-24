package com.knoldus

class QuickSortTest extends AnyFlatSpec {
  val quickSort = new QuickSort

  "QuickSort" should "return correct result" in {
    val result = {
      quickSort.sort(List(5, 8, 11, 32, 1))
    }
    assertResult(List(1,5,8,11,32))(result)
  }

  it should "return empty list" in {
    val result = quickSort.sort(List())
    assertResult(List())(result)
  }
}