import java.util.*

fun main(args: Array<String>) {
    println("Enter the arithmetic equation:")
    val scanner = Scanner(System.`in`)
    val s = scanner.nextLine()

    println(balanced(s))
}

fun balanced(s: String): Boolean
{
    var stack = Stack<Char>(s.length )
    for (i in 0 until s.length )
    {
        var ch: Char = s[i]
        if (ch == '(')
        {
            stack.push(ch)
        }
        else {
            if (stack.isEmpty())
                return false
            if (ch == ')' && stack.pop() != '(')
            {
                return false
            }

        }
    }
    return stack.isEmpty()
}
