import java.util.*

fun primefactors(n : Int) : Unit
{
    if(n%2==0)
    {
        var n = n/2
        println("2"+" ")
    }

    for(i in 3..n)
    {
        if(n%i == 0)
        {
            println(i)
        }
    }
}
// main function
fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    val n : Int = scanner.nextInt()
    primefactors(n)
}

