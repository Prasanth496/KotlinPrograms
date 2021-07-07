class PrimeInTwoDArray {
    companion object {
        // Function to check number is prime or not
        fun isPrime(n: Int): Boolean {
            var i = 2
            while (i <= n / 2) {
                if (n % i == 0) return false
                i++
            }
            return true
        }

        @JvmStatic
        fun main(args: Array<String>)
        {
            val a = Array(11) { arrayOfNulls<Any>(26) }
            a[0][0] = "----Range----"
            a[0][1] = "----Prime-numbers----"
            a[1][0] = "  0-100  "
            a[2][0] = "  101-200  "
            a[3][0] = "  201-300  "
            a[4][0] = "  301-400  "
            a[5][0] = "  401-500  "
            a[6][0] = "  501-600  "
            a[7][0] = "  601-700  "
            a[8][0] = "  701-800  "
            a[9][0] = "  801-900  "
            a[10][0] = "  901-1000  "
            var cindex = 1
            var rindex = 1
            var range = 100
            for (i in 2..1000) {
                if (isPrime(i) && i <= range) {
                    a[rindex][cindex] = i
                    cindex++
                }
                //Moving cursor to next row and first column
                if (i > range) {
                    range = range + 100
                    cindex = 1
                    rindex++
                }
            }
            //Displaying 2D Array
            for (i in 0..10) {
                for (j in 0..25) {
                    if (a[i][j] != null) print(a[i][j].toString() + "  ") else print(" ")
                }
                println()
            }
        }
    }
}