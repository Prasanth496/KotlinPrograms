import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    val base = 2
    println("Enter the exponent:")
    var exponent = scanner.nextInt()
    var result : Long = 1
    while(exponent != 0)
    {
        result *= base.toLong()
        exponent--
    }
    println("Power of 2 is $result")

}