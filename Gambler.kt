import java.util.*

fun main (args : Array<String>)
{
    val scanner = Scanner(System.`in`)
    println("Enter the stake:")
    val stake = scanner.nextInt()
    println("Enter the goal:")
    val goal = scanner.nextInt()
    println("Enter the number of trails:")
    val trails = scanner.nextInt()

    var bets = 0
    var wins = 0

    for(i in 0 until trails)
    {
        var cash = stake
        while(cash>0 && cash<goal)
        {
            bets++
            if(Math.random()<0.5)
                cash++
            else
                cash--
        }
        if(cash == goal)
            wins++
    }
        println("Number of wins $wins")
        println("Percentage of games won is ${100*wins/trails}")

}