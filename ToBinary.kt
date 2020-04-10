import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("enter the number to convert to binary form:")
    var num = scanner.nextInt()
}

fun binary(n : Int) : String
{
    var num = n
    var str : String = ""
    while(num>0)
    {
        str = (num % 2 ).toString() + str
        num /= 2
    }
    return (str)
}