fun merge(A: Array<Int>, p: Int, q: Int, r: Int)
{
    var left = A.copyOfRange(p, q + 1)
    var right = A.copyOfRange(q + 1, r + 1)
    var i = 0
    var j = 0

    for (k in p..r)
    {
        if ((i<=left.size-1) && ((j>=right.size) || (left[i]<=right[j])))
        {
            A[k] = left[i];
            i++;
        }
        else
        {
            A[k] = right[j];
            j++;
        }
    }
}

fun merge_sort(A: Array<Int>, p: Int, r: Int)
{
    if (p < r)
    {
        var q = (p + r) / 2
        merge_sort(A,p,q)
        merge_sort(A,q + 1,r)
        merge(A,p,q,r)
    }
}

fun main(arg: Array<String>)
{
    println("Enter number of elements :")
    var n = readLine()!!.toInt()

    println("Enter the elements : ")
    var A = Array(n, { 0 })
    for (i in 0 until n)
        A[i] = readLine()!!.toInt()

    merge_sort(A, 0, A.size - 1)

    println("The Sorted array is : ")
    for (i in 0 until n)
        print("${A[i]}  ")
}