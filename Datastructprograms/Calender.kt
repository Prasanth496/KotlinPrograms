import java.util.*

class Calendar {
    companion object {

        fun day(month: Int, day: Int, year: Int): Int
        {
            val y = year - (14 - month) / 12
            val x = y + y / 4 - y / 100 + y / 400
            val m = month + 12 * ((14 - month) / 12) - 2
            return (day + x + 31 * m / 12) % 7
        }

        // function will return true if the given year is a leap year
        fun isLeapYear(year: Int): Boolean
        {
            if (year % 4 == 0 && year % 100 != 0) return true
            return if (year % 400 == 0) true else false
        }

        @JvmStatic
        fun main(args: Array<String>)
        {
            val scanner = Scanner(System.`in`)
            println("Enter the month: ")
            val month = scanner.nextInt()
            println("Enter the year: ")
            val year = scanner.nextInt()

            val months = arrayOf("", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

            val days = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
            // checking for leap year
            if (month == 2 && isLeapYear(year)) days[month] = 29
            // printing calendar header
            println("   " + months[month] + " " + year)
            println(" S  M  T  W  Th  F Sa")
            // starting day
            val d = day(month, 1, year)
            // printing  the calendar
            for (i in 0 until d) print("   ")
            for (i in 1..days[month]) {
                if (i in 1 until 10)
                    print(" 0$i")
                else print(" $i")
                if ((i + d) % 7 == 0 || i == days[month])
                    println()
            }
        }
    }
}