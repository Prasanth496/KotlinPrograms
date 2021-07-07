import java.util.*

fun  Count() : Unit
    {
        val scanner = Scanner(System.`in`)
        println("Enter the people in the Queue")
        var num = scanner.nextInt()
        var q = Queue<String>(num)
        var amount = 10000

        while (q.size()<num)
        {
            println("Enter the name of customer: ")
            val name = scanner.nextLine()
            q.Enqueue(name)
        }

        println("Current Balance available is $amount")
        while(!q.isEmpty())
        {
            println("${q.Dequeue()} Enter W or w to withdraw and D or d to deposit")
            println("Enter the  amount: ")
            var entered = scanner.nextInt()
            var ch : Char ?= null
            if(ch == 'D' || ch == 'd')
            {
                amount += entered
                println("Succesfully Deposited the amount")
            }
            else if(ch == 'W' || ch =='w')
            {
                if (entered > amount)
                    println("amount exceeds the Bank Balance....!  ")
                else
                {
                    println("Succesfully Withrawn the amount")
                    amount -= entered
                }
            }
            else println("invalid Entry")
            println("Available Bank Balance is: $amount")
        }

        println("End Of Queue")


    }

fun main(args : Array<String>)
{

    return Count()
}