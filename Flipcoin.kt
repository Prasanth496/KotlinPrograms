import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter number of times to flip the coin")
    val num : Int = scanner.nextInt()
    var Tail = 0
    var Head = 0
    for(i in 0 until num)
    {
        var d : Double = Math.random()
        if(d <= 0.5)
        {
            Tail++
        }
        else
        {
            Head++
        }
        var result : Int = Head/Tail
        println(result)
    }






}