import scala.language.postfixOps

object QuickSort {
  def main(args: Array[String]) = {
    val b = List(4, 6, 3, 1, 34, 23) //values of list
    sort(b).foreach(n=> (print(n), print (" " )))
  }
  /*  Sort Function */
  def sort(b:List[Int]): List[Int] =  {
    if (b.length < 2) b
    else {

      val pivot = b(b.length / 2)
      sort (b filter (pivot>)) ++ (b filter (pivot == )) ++  //The filter() method is utilized to select all elements of List
        sort (b filter(pivot <))
    }
  }
}

