import java.lang.Math.random
import java.util.Scanner

fun Coupon(arr : IntArray, n : Int) : IntArray
{
    if(arr.size == 1)
    {
        arr[0] = n
        return arr
    }

    for(i in 0 until arr.size)
    {
        if(arr[i] == n)
         break
        if(arr[i] == 0)
        {
            arr[i] = n
            return arr
        }
    }
    return arr
}

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the number of distinct coupon numbers")
    val range  = scanner.nextInt()
    var r  = random()
    var distinct  = IntArray(range)
    var randomcount = 0

    while(true)
    {
        randomcount++
        var number  = range
        var distinct : IntArray = Coupon(distinct,number)
        if((distinct.size-1) != 0)
        {
            break
        }
        println("Number of random numbers required: $randomcount")
        println("Distinct random numbers are:")

        for(i in 0 until distinct.size)
        {
            println(distinct[i])
        }
    }

}

