import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    print("Enter the value of x:")
    val x : Int = scanner.nextInt()
    print("Enter the value of y:")
    val y : Int = scanner.nextInt()

    val distance : Double = Math.sqrt((x*x + y*y).toDouble())
    println("Distance from the point(x,y) to origin(0,0) is $distance" )


}