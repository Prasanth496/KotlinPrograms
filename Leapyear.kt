import java.util.*

fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter the year:")
    val year = scanner.nextInt()
    var leap = false
    if( year % 4 == 0)
    {
        if(year % 100 == 0)
        {
            leap = year % 400 == 0
        }
        else
            leap = true
    }
    else
        leap = false
        println(if(leap) "$year is a leap year" else "$year is not a leap year")
}