fun main() {
  val arr = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
  println(removeDuplicates(arr))
}

fun removeDuplicates(array: IntArray): Int {
  var l = 1
  for (r in 1 until array.size) {
    if (array[r] != array[r - 1]) {
      array[l] = array[r]
      l++
    }
  }
  return l
}
