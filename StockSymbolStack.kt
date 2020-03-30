import com.fasterxml.jackson.databind.ObjectMapper
import com.UserList
import java.io.File
import java.util.*

class Stack() {
    var array = UserList()
    var elementsize: Int = 0
    var top: Int = 0

    constructor(elementsize: Int) : this() {
        this.elementsize = elementsize
        this.top = -1
    }

    // function for adding the data
    fun push(data: String) {
        if (top == elementsize - 1) {
            print("StackOverflow")
        }
        array.add(data)
    }
    //function for removing the data
    fun pop(): String? {
        if (top == -1) {
            print("StackUnderFlow")
            return null
        }
        return array.removeLast()
    }
}

class StockSymbol {
    var stockSymbol: String? = null

    constructor() {}
    constructor(stockSymbol: String) {
        this.stockSymbol = stockSymbol
    }

    override fun toString(): String {
        return "StockSymbol $stockSymbol"
    }

}

fun main() {
    var read = Scanner(System.`in`)
    var stack = Stack()
    println("Enter the Stock symbol")
    var temp = read.next()
    var symbol=StockSymbol(temp)
    stack.push(symbol.toString())
    println("Enter the Stock symbol")
    temp = read.next()
    symbol=StockSymbol(temp)
    stack.push(symbol.toString())
    println("Enter the Stock symbol")
    temp = read.next()
    symbol=StockSymbol(temp)
    stack.push(symbol.toString())
    mapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), stack)
}