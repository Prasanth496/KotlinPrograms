import java.io.PrintWriter
import java.util.*

fun printTwoDArray(array: Array<Array<Any?>>)
{
    val pw = PrintWriter(System.out, true)
    for (i in array.indices)
    {
        for (j in array.indices)
        {
            pw.printf(array[i][j].toString() + " ")
        }
        println()
    }
}

fun main(args: Array<String>)
{
    val scanner = Scanner(System.`in`)
    var rows = 0
    var columns = 0
    println("Enter  the number of rows: ")
    rows = scanner.nextInt()
    println("Enter  the number of columns: ")
    columns = scanner.nextInt()
    val a = Array(rows) { arrayOfNulls<Any>(columns) }
    println("Enter the elements row wise: ")
    for (i in a.indices)
    {
        for (j in a.indices)
        {
            a[i][j] = scanner.next()
        }
    }
    printTwoDArray(a)
}