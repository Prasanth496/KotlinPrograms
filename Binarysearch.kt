fun doBinarySearch ()
    {
        println("Enter the elements:")
        val inputList = readLine()!!.split(',').map(String :: toString)
        val listSorted = inputList.sorted()
        println("Enter the element you want to find:")
        val item = readLine()!!.toString()
        var low = 0
        var high = listSorted.size - 1
        var isItemFound = false

        while (low <= high)
        {
            val mid = (low + high) / 2
            val guess = listSorted[mid]

            when
            {
                guess == item -> {
                    println("Your element $item was found")
                    isItemFound = true
                }
                guess > item -> high = mid-1
                else -> low = mid+1
            }
            if (isItemFound)
                break
        }
        if (!isItemFound)
        {
            println("Your element was not found")
        }
    }

fun main(args : Array<String>)
{
   return doBinarySearch()
}
