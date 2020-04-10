import com.UserList
import java.io.File
import java.util.*

class Queue {
    private var array = UserList()
    private var elementSize: Int = 0
    private var front = 0
    private var rear = 0

    constructor(elementSize: Int) {
        this.elementSize = elementSize
        this.front = 0
        this.rear = 0
    }

    fun enque(data: String) {
        if (elementSize == rear) {
            println("Queue is overflow")
        }
        array.add(data)
        front++
    }

    fun diplayQueue() {
        if (front == rear) {
            println("Queue is empty")
            return
        }

        print(array.list())
    }
}

class DateTime {
    var dateTime = 0
    constructor(){}
    constructor(dateTime: Int) {
        this.dateTime = dateTime
    }

    override fun toString(): String {
        return "DateTime $dateTime"
    }
}

fun main() {
    var read = Scanner(System.`in`)
    var queue = Queue(3)
    println("Enter the DateTime")
    var temp = read.nextInt()
    var dateTime = DateTime(temp)
    queue.enque(dateTime.toString())
    println("Enter the DateTime")
    temp = read.nextInt()
    dateTime = DateTime(temp)
    queue.enque(dateTime.toString())
    println("Enter the DateTime")
    temp = read.nextInt()
    dateTime = DateTime(temp)
    queue.enque(dateTime.toString())
    queue.diplayQueue()
    mapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address"), queue)
}