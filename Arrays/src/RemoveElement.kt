fun removeElement(nums: IntArray, `val`: Int): Int {
  var pointer = 0
  for (n in nums) {
    if (n != `val`) {
      nums[pointer] = n
      pointer++
    }
  }
  return pointer
}

fun main() {
  val arr = intArrayOf(3, 2, 2, 4, 5, 3)
  println(removeElement(arr, 2))
}
