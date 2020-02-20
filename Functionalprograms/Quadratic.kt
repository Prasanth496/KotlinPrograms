import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the values of a,b and c:")
    val a : Double = scanner.nextDouble()
    val b : Double = scanner.nextDouble()
    val c : Double = scanner.nextDouble()

    val delta : Double = b*b-4*a*c
    val squareroot : Double = Math.sqrt(delta)
    val firstroot : Double = (-b+squareroot)/(2*a)
    val secondroot : Double = (-b-squareroot)/(2*a)
    println("Quadratic equation is ${a}x^2+${b}x+$c")
    println("firstroot is ${firstroot}")
    println("secondroot is ${secondroot}")


}