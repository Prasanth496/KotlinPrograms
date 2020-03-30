package com.AddressBook

import java.io.File
import java.util.*


var objectmapper = ObjectMapper()

class ObjectMapper {
    fun readValue(file: File, java: Class<Array<AddressBook>>): Array<AddressBook> {
            return readValue(file, java)
    }

    fun writeValue(file: File, list: ArrayList<AddressBook>) {

    }

}

var List = ArrayList<AddressBook>()
fun addElement() {
    val readJsonValue: Array<AddressBook> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<AddressBook>::class.java)
    println(readJsonValue)
    for (index in readJsonValue) {
        print(("$index "))
        List.add(index)
    }
    val read = Scanner(System.`in`)
    println("Enter the FirstName")
    val firstName = read.next()
    println("Enter the LastName")
    val lastName = read.next()
    println("Enter the City")
    val city = read.next()
    println("Enter the State")
    val state = read.next()
    println("Enter the 6 Digit Zip")
    val zip = read.nextLong()
    println("Enter the PhoneNumber")
    val phoneNumber: Long = read.nextLong()
    println("Enter the StreetName")
    val streetName = read.next()
    println("Enter the Area")
    val area = read.next()
    val addressbook = AddressBook(firstName, lastName, city, state, phoneNumber, streetName, area, zip)
    List.add(addressbook)
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), List)

}
// function for editing the element
fun editElement() {
    val read = Scanner(System.`in`)
    val readJsonValue: Array<AddressBook> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<AddressBook>::class.java)
    println("Enter the Firstname")
    var employeeFirstName = read.next()
    println("Enter the Lastname")
    var employeeLastName = read.next()
    for (index in readJsonValue) {
        if (index.firstName.equals(employeeFirstName) && index.lastName.equals(employeeLastName)) {
            println("Choose in the upcoming values\n" +
                    "Press-1 for Edit FirstName \nPress-2 for Edit LastName \n" +
                    "Press-3 for Edit City \nPress-4 for Edit State \n" +
                    "Press-5 for Edit Zip \nPress-6 for Edit phoneNumber \n" +
                    "Press-7 for Edit StreetName \nPress-6 for Edit Area")
            val temp = read.nextInt()
            var temporaryVariable: Any? = null
            when (temp) {
                1 -> {
                    println("Enter the FirstName")
                    temporaryVariable = read.next()
                    index.firstName = temporaryVariable
                }
                2 -> {
                    println("Enter the LastName")
                    temporaryVariable = read.next()
                    index.lastName = temporaryVariable
                }
                3 -> {
                    println("Enter the City")
                    temporaryVariable = read.next()
                    index.city = temporaryVariable
                }
                4 -> {
                    println("Enter the State")
                    temporaryVariable = read.next()
                    index.state = temporaryVariable
                }
                5 -> {
                    println("Enter the 6 digit Zip")
                    temporaryVariable = read.nextLong()
                    index.zip = temporaryVariable
                }
                6 -> {
                    println("Enter the PhoneNumber")
                    temporaryVariable = read.nextLong()
                    index.phoneNumber = temporaryVariable

                }
                7 -> {
                    println("Enter the StreetName")
                    temporaryVariable = read.next()
                    index.streetName = temporaryVariable
                }
                8 -> {
                    println("Enter the Area")
                    temporaryVariable = read.next()
                    index.area = temporaryVariable
                }
            }
        }
        List.add(index)
        objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), List)
    }
}
// function for removing the element
fun removeElement() {
    val read = Scanner(System.`in`)
    val readJsonValue: Array<AddressBook> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<AddressBook>::class.java)
    println("Enter the Firstname")
    var employeeFirstName = read.next()
    println("Enter the Lastname")
    var employeeLastName = read.next()
    for (index in readJsonValue) {
        if (index.firstName.equals(employeeFirstName) && index.lastName.equals(employeeLastName)) {
            continue
        }
        List.add(index)
    }
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), List)
}
// function for the name
fun sortByName() {
    val readJsonValue: Array<AddressBook> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<AddressBook>::class.java)
    for (rowIndex in 0 until readJsonValue.size - 1) {
        for (columnIndex in rowIndex + 1 until readJsonValue.size) {
            var firstString = readJsonValue[rowIndex].firstName + readJsonValue[rowIndex].lastName
            var secondString = readJsonValue[columnIndex].firstName + readJsonValue[columnIndex].lastName
            if (firstString > secondString) {
                var temp = readJsonValue[rowIndex]
                readJsonValue[rowIndex] = readJsonValue[columnIndex]
                readJsonValue[columnIndex] = temp
            }
        }
    }
    for (index in readJsonValue) {
        List.add(index)
    }
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), List)
}
// function for zipcode
fun sortByZip() {
    val readJsonValue: Array<AddressBook> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\address.json"), Array<AddressBook>::class.java)
    for (rowIndex in 0 until readJsonValue.size - 1) {
        for (columnIndex in rowIndex + 1 until readJsonValue.size) {
            var firstString = readJsonValue[rowIndex].zip
            var secondString = readJsonValue[columnIndex].zip
            if (firstString > secondString) {
                var temp = readJsonValue[rowIndex]
                readJsonValue[rowIndex] = readJsonValue[columnIndex]
                readJsonValue[columnIndex] = temp
            }
        }
    }
    for (index in readJsonValue) {
        List.add(index)
    }
    objectmapper.writeValue(File("/home/bridgelabz/IdeaProjects/Oops_Programs/src/main/kotlin/ar.json"), List)
}

// main function
fun main() {
    val read = Scanner(System.`in`)
    println("Choose in the upcoming values\nPress-1 for Add element \nPress-2 for Edit element" +
            "\nPress-3 for remove element \nPress-4 for sort by name \npress-5 for sort by zip" +
            "\nPress-6 for terminate")
    val temp = read.nextInt()
    when (temp) {
        1 -> addElement()
        2 -> editElement()
        3 -> removeElement()
        4 -> sortByName()
        5 -> sortByZip()
        6 -> println("Done")

    }

}


