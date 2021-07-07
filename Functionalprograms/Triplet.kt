import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    val arr = arrayOf(-2,4,-2,4,-5,6,-8,9)
    var tripletcount = 0

    for(i : Int in 0 until arr.size)
    {
        for(j : Int in i+1 until arr.size)
        {
            for(k : Int in j+1 until arr.size)
            {
                if(arr[i]+arr[j]+arr[k] == 0)
                {
                    println("${arr[i]},${arr[j]},${arr[k]}")
                    tripletcount++
                }
            }
        }
    }
    println("Number of triplets whose value is zero is $tripletcount")
}