import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    print("Enter the String:")
    var str = scanner.nextLine()
    print("Enter the old value:")
    val oldvalue = scanner.nextLine()
    print("Enter the new value:")
    val newvalue = scanner.nextLine()
    val output = str.replace(oldvalue, newvalue)
    println(output)

}