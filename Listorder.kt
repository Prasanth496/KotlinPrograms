import com.sun.xml.internal.fastinfoset.util.StringArray
import java.io.*

fun Driver() {

    val reader = BufferedReader(inputstream.reader())
    println("Enter the file fileName: ")
    val FilePath = reader.readLine()
    var array : File  = File(FilePath)
    var list : String = ArrayToList(array)
    println("Enter the word : ")
    var word = reader.readLine()
    println("Before Processing")
    var content = File(FilePath)
    println(content)
    if (list.Search(word))
    {
        println("$word is found in the file so removing it")
        list.Remove(word)

    }
    else
    {
        println("$word is not found so adding it to List")
        list.Append(word)
    }
    println("After Processing")
    println(list)
    var arrayInputStream = ListToArray(list)
    println(FilePath)
    println("This is from final File: ");
    println(FilePath)
}


fun ArrayToList(arr: File): List<StringArray> {
    var  list = List<StringArray>()
    for (list in arr)
    list.Append(content)
    return list
}
fun ListToArray(list) : StringArray
{

    var arr = arrayOf(list.size())
    for(i in 0 until list.size())
    {
        arr[i] = list.peek(i)
    }
    return arr
}
