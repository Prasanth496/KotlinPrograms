import java.io.File
import java.util.*
import kotlin.collections.ArrayList

class StockAccount {
    // StockAccount contains different variables like stockname,numberofshares and shareprice
    var stockName: String? = null
    var numberOfShare: Int = 0
    var sharePrice: Double = 0.0

    // constructor declaration
    constructor(stockName: String?, numberOfShare: Int, sharePrice: Double) {
        this.stockName = stockName
        this.numberOfShare = numberOfShare
        this.sharePrice = sharePrice
    }

    override fun toString(): String {
        return "[StockName=$stockName, NumberOfShare=$numberOfShare, SharePrice=$sharePrice] "
    }
}
// function for number of stocks
private fun enteringValues(numberOfStocks: Int) {
    var numberOfStocks1 = numberOfStocks
    while (numberOfStocks1 > 0) {
        println("Enter the StockName")
        var stockName = read.next()
        println("Enter the NumberOfShare")
        var numberOfShare = read.nextInt()
        println("Enter the SharePrice")
        var sharePrice = read.nextDouble()
        var stockAccount = StockAccount(stockName, numberOfShare, sharePrice)
        stockList.add(stockAccount)
        numberOfStocks1--
    }
}
// function for stockreport
fun stockReport() {
    val readJsonValue: Array<StockAccount> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), Array<StockAccount>::class.java)
    println("Stock Report :")
    var count = 0.0
    for (index in readJsonValue) {
        println("StockName: ${index.stockName}")
        println("NumberOfShare: ${index.numberOfShare}")
        println("SharePrice: ${index.sharePrice}")
        println("Value of Stock: ${index.numberOfShare * index.sharePrice}")
        count += (index.numberOfShare * index.sharePrice)
        println()
    }
    println("Total Value: $count")
}

var read = Scanner(System.`in`)
var stockList = ArrayList<StockAccount>()
fun main() {
    //  Stock Names, Number of Share, Share Price.
    println("Enter the no of Stocks")
    var numberOfStocks = read.nextInt()
    enteringValues(numberOfStocks)
    objectmapper.writeValue(File("ar.json"), stockList)
    val readJsonValue: Array<StockAccount> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<StockAccount>::class.java)
    for (i in readJsonValue) {
        print("$i")
    }
    stockReport()
}