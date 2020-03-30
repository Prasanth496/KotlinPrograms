

class StringPermutationIterative {
    companion object {
        //Iterative function to generate all permutations of a String
        fun permutations(s: String) {
            val partial: List<String> = List<String>()

            partial.Add(s[0].toString())
            for (i in 1 until s.length) {
                for (j in partial.size() - 1 downTo 0) {
                    val str: String? = partial.Pop(j)
                    if (str != null) {
                        for (k in 0..str.length) {
                            partial.Add(
                                str.substring(0, k) + s[i] + str.substring(k)
                            )
                        }
                    }
                }
            }
            println(partial)
        }

        // Iterative program to generate all permutations of a String in Java
        @JvmStatic
        fun main(args: Array<String>) {
            val s = "ABC"
            permutations(s)
        }
    }
}