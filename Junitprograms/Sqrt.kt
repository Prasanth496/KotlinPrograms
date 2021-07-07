import java.util.*

fun main(args : Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Enter the number:")
    var t = scanner.nextDouble()
    var c : Double = t
    var epsilon : Double = 1e-15
    while(Math.abs(t-c/t)>epsilon*t)
    {
        t = (c/t+t)/2
    }
    println("The squareroot of number is $t")
}

