fun insertion(Arr: Array<Int>)
{
    var n = Arr.size
    var i: Int
    for (j in 1 until n)
    {
        var key = Arr[j]
        i = j - 1
        while (i >= 0 && Arr[i] > key)
        {
            Arr[i + 1] = Arr[i]
            i--
        }
        Arr[i + 1] = key
    }
}

fun main(arg: Array<String>)
{
    print("Enter number of elements :")
    var n = readLine()!!.toInt()

    println("Enter the elements : ")
    var Arr = Array(n, { 0 })
    for (i in 0 until n)
        Arr[i] = readLine()!!.toInt()

    insertion(Arr)

    println("The Sorted array is : ")
    for (i in 0 until n)
        print("${Arr[i]}  ")
}