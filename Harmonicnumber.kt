
fun main(args : Array<String>)
{
    var n : Int = Integer.parseInt(args[0])


    var sum : Double = 0.0
    for(i : Int in 1..n)
    {
        sum +=  1.0/i
    }
    println(sum)
}