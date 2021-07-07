import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the temperature in fahrenhit:")
    val f = scanner.nextDouble()
    println("Enter the temperature in celsius:")
    val c = scanner.nextDouble()
    val celsiustofahrenhit : Double = (c*9/5)+32
    val fahrenhittocelsius : Double = (f-32)*5/9

    println("Temperature from celsius to fahrenhit is $celsiustofahrenhit")
    println("Temperature from fahrenhit to celsius is $fahrenhittocelsius")
}