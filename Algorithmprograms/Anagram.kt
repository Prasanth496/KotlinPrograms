import java.util.*
fun main(args : Array<String>)
    {
        var str1 = "Umar"
        var str2 = "Ramu"
        str1.toLowerCase()
        str2.toLowerCase()
        var isAnagram = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray())
        if(isAnagram)
            println("Strings are not anagram")
        else
            println("Strings are anagram")

    }
