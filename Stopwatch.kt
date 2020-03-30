import java.time.LocalDateTime
import java.util.*

fun main(args: Array<String>)
{
    val time = LocalDateTime.now()
    val scanner = Scanner(System.`in`)
    var beforeStartHour = 0
    var beforeStartMinutes = 0
    var beforeStartSeconds = 0
    var afterStopHour = 0
    var afterStopMinutes = 0
    var afterStopSeconds = 0
    while (true)
    {
        println("Press S to start the watch: ")
        val c: Char = scanner.next().get(0)
        if (c != 's' && c != 'S') println("Invalid input: ") else break
    }
    beforeStartHour = time.hour
    beforeStartMinutes = time.minute
    beforeStartSeconds = time.second
    println("Begin time of Stop-Watch is: ")
    println(beforeStartHour.toString() + "hr :" + beforeStartMinutes + "min :" + beforeStartSeconds + "sec")
    val beforeTime = beforeStartHour*3600 + beforeStartMinutes*60 + beforeStartSeconds
    while (true)
    {
        println("Press Q to stop the watch: ")
        val c: Char = scanner.next().get(0)
        if (c != 'q' && c != 'Q')
            println("Invalid input: ")
        else break
    }

    val time1 = LocalDateTime.now()
    afterStopHour = time1.hour
    afterStopMinutes = time1.minute
    afterStopSeconds = time1.second
    println("Stop time of Stop-Watch is: ")
    println(afterStopHour.toString() + "hr :" + afterStopMinutes + "min :" + afterStopSeconds + "sec")
    val aftertime = afterStopHour*3600 + afterStopMinutes*60 + afterStopSeconds
    val r1 = (aftertime-beforeTime) % 3600
    val totalhr = (aftertime-beforeTime) / 3600
    val r2 = r1 % 60
    val totlamin = r1 / 60
    println("Total time elapsed is: ")
    println(totalhr.toString() + "hr :" + totlamin + "min :" + r2 + "sec")
}