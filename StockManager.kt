import java.io.File
import java.util.*
import kotlin.collections.ArrayList

class StockAccounts {
    // StockAccount contains different variables like stockname,numberofshares and shareprice
    var stockName: String? = null
    var numberOfShare: Int = 0
    var sharePrice: Int = 0


    constructor(stockName: String?, numberOfShare: Int, sharePrice: Int) {
        this.stockName = stockName
        this.numberOfShare = numberOfShare
        this.sharePrice = sharePrice
    }

    override fun toString(): String {
        return "[StockName=$stockName, NumberOfShare=$numberOfShare, SharePrice=$sharePrice] "
    }
}
// function to count number of stocks
fun valueOf() {
    val readJsonValue: Array<StockAccounts> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), Array<StockAccounts>::class.java)
    var count = 0.0
    for (index in readJsonValue) {
        println("StockName: ${index.stockName}")
        println("Value of Stock: ${index.numberOfShare * index.sharePrice}")
        count += (index.numberOfShare * index.sharePrice)
        println()
    }
    println("Total Value of the account: $count")
}
//function to buy the stocks
fun buy(amount: Int, symbol: String) {
    val userValue: Array<StockAccounts> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), Array<StockAccounts>::class.java)
    val companyValue: Array<CompanyShare> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), Array<CompanyShare>::class.java)
    val newUserArray: ArrayList<StockAccounts> = ArrayList<StockAccounts>()
    val newCompanyArray: ArrayList<CompanyShare> = ArrayList<CompanyShare>()
    var count=0
    for (index in userValue){
        if (index.stockName == symbol) count++
    }
    for (companyIndex in companyValue) {
        if (companyIndex.stockSymbol == symbol && count == 0){
            newUserArray.add(StockAccounts(companyIndex.stockSymbol, companyIndex.numberOfShares, companyIndex.datetime))
            count++
        }
        else if (companyIndex.stockSymbol == symbol) {
            newCompanyArray.add(CompanyShare(companyIndex.stockSymbol, companyIndex.numberOfShares - amount, companyIndex.datetime))
            continue
        }
        newCompanyArray.add(companyIndex)
    }
    for (userIndex in userValue) {
        if (userIndex.stockName == symbol) {
            newUserArray.add(StockAccounts(userIndex.stockName, userIndex.numberOfShare + amount, userIndex.sharePrice))
            continue
        }
        newUserArray.add(userIndex)
    }
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), newUserArray)
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), newCompanyArray)
}
// function for selling the stocks
fun sell(amount: Int, symbol: String) {
    val userValue: Array<StockAccounts> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), Array<StockAccounts>::class.java)
    val companyValue: Array<CompanyShare> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\addressBook"), Array<CompanyShare>::class.java)
    var newUserArray: ArrayList<StockAccounts> = ArrayList<StockAccounts>()
    var newCompanyArray: ArrayList<CompanyShare> = ArrayList<CompanyShare>()
    for (companyIndex in companyValue) {
        if (companyIndex.stockSymbol == symbol) {
            newCompanyArray.add(CompanyShare(companyIndex.stockSymbol, companyIndex.numberOfShares + amount, companyIndex.datetime))
            continue
        }
        newCompanyArray.add(companyIndex)
    }
    for (userIndex in userValue) {
        if (userIndex.stockName == symbol) {
            newUserArray.add(StockAccounts(userIndex.stockName, userIndex.numberOfShare - amount, userIndex.sharePrice))
            continue
        }
        newUserArray.add(userIndex)
    }
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), newUserArray)
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), newCompanyArray)
}

fun printReport() {
    val userValue: Array<StockAccounts> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\ad.json"), Array<StockAccounts>::class.java)
    val companyValue: Array<CompanyShare> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\com\\address"), Array<CompanyShare>::class.java)
    var count = 0.0
    for (index in userValue) {
        println("StockName: ${index.stockName}")
        println("NumberOfShare: ${index.numberOfShare}")
        println("SharePrice: ${index.sharePrice}")
        println("Value of Stock: ${index.numberOfShare * index.sharePrice}")
        count += (index.numberOfShare * index.sharePrice)
        println()
    }
    println("Total Value: $count")
    for (index in companyValue) {
        println("StockSymbol: ${index.stockSymbol}")
        println("NumberOfShares: ${index.numberOfShares}")
        println("Datetime: ${index.datetime}")
        println()
    }
}


fun main() {
    var read = Scanner(System.`in`)
    println("Choose the upcoming values\nPress-1 for Buy stock \nPress-2 for Sell the stock" +
            "\nPress-3 for Value of the account \nPress-4 for to Print Report " +
            "\nPress-5 for terminate")
    val temp = read.nextInt()
    when (temp) {
        1 -> {
            println("Enter the no of stock you want to buy")
            var amount=read.nextInt()
            println("Enter the Stock symbol")
            var symbol=read.next()
            buy(amount, symbol)
        }

        2 -> {
            println("Enter the no of stock want to buy")
            var amount=read.nextInt()
            println("Enter the Stock symbol")
            var symbol=read.next()
            sell(amount, symbol)
        }
        3 -> valueOf()
        4 -> printReport()
        5 -> println("Thanks")
    }
}