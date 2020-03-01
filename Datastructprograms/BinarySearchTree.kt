import BinarySearchTree.Companion.factorial
import java.util.*

class BinarySearchTree {
    companion object {
        fun factorial(n: Int): Int {
            var fact = 1
            var n = 0
            while (n > 0) {
                fact = fact * n
                n--;
            }
            return fact
        }
    }
}

        fun main(args: Array<String>)
        {
            val scanner = Scanner(System.`in`)
            println("Enter number of nodes to get number of binary search trees possible: ")
            val nodes: Int = scanner.nextInt()
            val numberOfBinarySearchTrees = factorial(2 * nodes) / (factorial(nodes + 1) * factorial(nodes))
            println("$numberOfBinarySearchTrees Binary Search Trees are possible for $nodes nodes")
        }

