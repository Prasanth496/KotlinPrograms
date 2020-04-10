class StringPermutationRecursion {
    companion object {
        // Recursive function to generate all permutations of a String
        private fun permutations(str1: String, str2: String) {
            if (str2.length == 0) {
                println(str1)
            }
            for (i in 0 until str2.length) {
                val newString1 = str1 + str2[i]
                val newString2 = str2.substring(0, i) + str2.substring(i + 1)
                permutations(newString1, newString2)
            }
        }

        // Find Permutations of a String
        @JvmStatic
        fun main(args: Array<String>)
        {
            val s = "ABC"
            permutations("", s)
        }
    }
}