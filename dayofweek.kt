import java.util.*

fun main(args : Array<String>)
{
    val days = arrayListOf<String>("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val scanner = Scanner(System.`in`)
    println("Enter the value of month:")
    val m = scanner.nextInt()
    println("Enter the value of day:")
    val d = scanner.nextInt()
    println("Enter the value of year:")
    val y = scanner.nextInt()

    val y0 = y - (14 - m) / 12
    val x = y0 + y0 / 4 - y0 / 100 + y0 / 400
    val m0 = m + 12 * ((14 - m) / 12) - 2
    val d0 = (d + x + 31 * m0 / 12) % 7

    println(days[d0])


}