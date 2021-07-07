import java.util.*
import kotlin.math.pow

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the temperature in fahrenhit,temperature<=50:")
    val t : Double = scanner.nextDouble()
    println("Enter the speed in miles per hour,3<=speed && speed<=120:")
    val v : Double = scanner.nextDouble()

    val w : Double = 35.74+(0.6215*t-35.75)*v.pow(0.16)
    println("The value of w is : $w")


}