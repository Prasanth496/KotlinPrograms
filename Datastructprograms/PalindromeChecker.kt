import java.util.*

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the String  to check for Palindrome:")
    val str = scanner.nextLine()
    isPalindrome(str)
}
fun isPalindrome(str : String) : Boolean
{
    //Adding elements to queue
    var q = Deque<Char>();
    for (i in 0 until str.length)
    q.AddRear(str[i])


    while(!q.IsEmpty())
    {
        //at last there there is only 1 element will be present
        //so breaking at that point
        if (q.Size() == 1)
            break
        if(!(q.RemoveFront().equals(q.RemoveRear())))
        {
            println("Given String is not Palindrome")
            return false
        }
    }
    println("Given String is Palindrome");
    return true
}
