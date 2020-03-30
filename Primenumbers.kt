fun main(args: Array<String>) {
    var low = 1
    val high = 1000
    while (low < high)
    {
        if (checkPrimeNumber(low))
            println(low.toString() + " ")
        low++

    }
}
fun checkPrimeNumber(num: Int): Boolean
{
    var flag = true
    for (i in 2..num / 2)
    {
        if (num % i == 0)
        {
            flag = false
            break
        }
    }
    return flag
}
