import java.util.*

    fun nibbleswap(str: String): String {
        var number = ""
        for (i in str.length - 4 until str.length - 1) {
            number = number + str[i]
        }
        for (i in 0 until 4) {
            number += str[i]
        }
        return number
    }

    fun binarytodecimal(str: String): Int {
        var a = str.toInt()
        var n = 0
        var p = 1
        while (a > 0) {
            var d = a % 10
            n += d * p
            p *= 2
            a = a / 10
        }
        return n
    }

    fun powerof2(n: Double): Boolean {
        var i = 1.0
        while (n / 2 > i) {
            if (Math.pow(2.0, i++) == n) {
                return true
            }
        }
        return false
    }

    fun main() {
        val scanner = Scanner(System.`in`)
        println("enter the number")
        val num = scanner.nextInt()
        var str = binary(num)
        println("The binary value of $num is $str")
        var swapstring = nibbleswap(str)
        println("Binary value after swapping is $swapstring")
        var finalvalue = binarytodecimal(swapstring)
        println("Decimal value of swapped binary is $finalvalue")
        if (powerof2(finalvalue.toDouble()))
        {
            println("The number is power of 2")
        }
        else
        {
            println("The number is not power of 2")
        }
    }
