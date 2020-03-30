
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.BufferedReader
import java.io.File
import java.io.FileWriter
import java.util.*

class UserList {
    var head: Node? = null
    fun add(data: String) {
        var temp: Node
        var newnode: Node = Node(data, null)
        if (head == null) {
            head = newnode
            return
        }
        temp = head!!
        var primary: Node = head!!
        while (temp.next != null) {
            temp = temp.next!!
            if (temp.data == data) {
                println("Element ${temp.data} is already presrnt in the list")
                return
            }
        }
        if (data == primary.data) {
            println("Element ${primary.data}is already present in the list")
            return
        }
        temp.next = newnode
        return

    }
    // searching for the data
    fun search(data: String): Boolean {
        var temp: Node = head!!
        var primary: Node = temp
        while (temp.next != null) {
            if (temp.data == data) {
                return true
            }
            temp = temp.next!!
            primary = temp
        }
        if (temp.data == primary.data) {
            return true
        }
        return false
    }
    //removing the data
    fun remove(data: String) {
        var temp = head!!
        var primary: Node = temp
        if (temp.data == data) {
            head = temp.next!!
            return
        }
        while (temp.next != null) {
            temp = temp.next!!
            if (temp.data == data) {
                primary.next = temp.next!!
                return
            }
            if (temp.next == null) {
                primary.next = null
                return
            }
            primary = temp
        }

    }
    //removing the last value
    fun removeLast(): String {
        var value: String? = null
        var temp = head!!
        var primary: Node = temp
        if (temp.next == null) {
            value = temp.data
            head = null
            return value
        }
        while (temp.next != null) {
            temp = temp.next!!
            primary = temp
        }
        value = temp.data
        primary.next = temp.next
        return value
    }
    //removing the firstvalue
    fun removeFirst(): String {
        var value: String? = null
        var temp = head!!
        var primary: Node = temp
        if (temp.next == null) {
            value = temp.data
            head = null
            return value
        }
        while (temp.next != null) {
            value = temp.data
            head = temp.next!!
            return value
        }
        return "null"
    }

    fun list(): String {
        var string: String = "["
        if (head == null) {
            return "toss"
        } else {
            var temp: Node = head!!
            if (head == null) {
                string = string + "List is empty"
                return string + "]"
            }
            while (temp.next != null) {
                string = string + temp.data
                if (temp.next != null) {
                    string = string + "->"
                    temp = temp.next!!
                }
            }
            return string + temp.data + "]"
        }
    }
}

class Node(var data: String, var next: Node?)

fun main() {
    var read = Scanner(System.`in`)
    var userListObject = UserList()
    var mapper= ObjectMapper()
    println("Enter the StockSymbol")
    var stockSymbol = read.next()
    println("Enter the NumberOfShares")
    var numberOfShares = read.nextInt()
    println("Enter the Datetime")
    var dateTime = read.nextInt()
    var companyShare = CompanyShare(stockSymbol, numberOfShares, dateTime)
    userListObject.add(companyShare.toString())
    println("Enter the StockSymbol")
    stockSymbol = read.next()
    println("Enter the NumberOfShares")
    numberOfShares = read.nextInt()
    println("Enter the Datetime")
    dateTime = read.nextInt()
    companyShare = CompanyShare(stockSymbol, numberOfShares, dateTime)
    userListObject.add(companyShare.toString())
    println("Enter the StockSymbol")
    stockSymbol = read.next()
    println("Enter the NumberOfShares")
    numberOfShares = read.nextInt()
    println("Enter the Datetime")
    dateTime = read.nextInt()
    companyShare = CompanyShare(stockSymbol, numberOfShares, dateTime)
    userListObject.add(companyShare.toString())
    mapper.writeValue(File(""), userListObject)
}