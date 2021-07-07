import java.util.*

fun givechange(amount : Int) : Unit
{
    var amount = amount
    var number = 0
    var thousand = 0
    var fivehundred = 0
    var hundred = 0
    var fifty = 0
    var twenty = 0
    var ten = 0
    var two = 0
    var one = 0
    var five = 0

    while(amount>=1000)
    {
        thousand++
        number++
        amount = amount-1000
    }
    while(amount>=500)
    {
        fivehundred++
        number++
        amount = amount-500
    }
    while(amount>=100)
    {
        hundred++
        number++
        amount = amount-100
    }
    while(amount>=50)
    {
        fifty++
        number++
        amount = amount-50
    }
    while(amount>=20)
    {
        twenty++
        number++
        amount = amount-20
    }
    while(amount>=10)
    {
        ten++
        number++
        amount = amount-10
    }
    while(amount>=5)
    {
        five++
        number++
        amount = amount-5
    }
    while(amount>=2)
    {
        two++
        number++
        amount = amount-2
    }
    while(amount>=1)
    {
        one++
        number++
        amount = amount-1
    }
    println("Number of changes are $number")
    if(!(thousand == 0))
    {
        println("Number of thousand notes are $thousand")
    }
    if(!(fivehundred == 0))
    {
        println("Number of fivehundred notes are $fivehundred")
    }
    if(!(hundred == 0))
    {
        println("Number of hundred notes are $hundred")
    }
    if(!(fifty == 0))
    {
        println("Number of fifty notes are $fifty")
    }
    if(!(twenty == 0))
    {
        println("Number of twenty notes are $twenty")
    }
    if(!(five == 0))
    {
        println("Number of five notes are $five")
    }
    if(!(ten == 0))
    {
        println("Number of ten notes are $ten")
    }
    if(!(two == 0))
    {
        println("Number of two notes are $two")
    }
    if(!(one == 0))
    {
        println("Number of one notes are $one")
    }
}

fun main(args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the amount:")
    val amount = scanner.nextInt()
    givechange(amount)
}
