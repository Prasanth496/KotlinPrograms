package com.Clinique

import java.io.*
import java.util.*


// function for searching by the  doctor name
fun searchByDoctorName(name: String) {
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        if (index.name == name) {
            print(index)
            return
        }
    }
}

//fuction for search by doctorid
fun searchByDoctorId(id: Int) {
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        if (index.id == id) {
            print(index)
            return
        }
    }
}

//search by doctor specialization
fun searchByDoctorSpecialization(specialization: String) {
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        if (index.specialization == specialization) {
            print(index)
        }
        println()
    }
}

//search by doctor availability
fun searchByDoctorAvailability(availabilityTime: Double) {
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        if (index.availabilityTime <= availabilityTime || index.availabilityTime >= availabilityTime) {
            print(index)
        }
        println()
    }
}

//search by Patient name
fun searchByPatientname(name: String) {
    var readJsonValue: Array<Patient> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Patient.json"), Array<Patient>::class.java)
    for (index in readJsonValue) {
        if (index.name == name) {
            print(index)
        }
        println()
    }
}

//search by Patient MobileNumber
fun searchByPatientMobile(mobileNumber: Long) {
    var readJsonValue: Array<Patient> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Patient.json"), Array<Patient>::class.java)
    for (index in readJsonValue) {
        if (index.mobileNumber == mobileNumber) {
            print(index)
        }
        println()
    }
}

//search by Patient ID
fun searchByPatientId(id: Int) {
    var readJsonValue: Array<Patient> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Patient.json"), Array<Patient>::class.java)
    for (index in readJsonValue) {
        if (index.id == id) {
            print(index)
        }
        println()
    }
}

//taking appointment to meet Doctor
fun appointment(name: String) {
    var read = Scanner(System.`in`)
    var list = ArrayList<Doctor>()
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        if (index.name == name) {
            print(index)
            if (index.appointment >= 5) {
                println("Doctor's appointment is full please select another doctor \n" +
                        "If you want to make another appointment press1 \n" +
                        "or to terminate the appointment press2")
                var temp = read.nextInt()
                if (temp == 1) {
                    println("Enter the doctor name")
                    var doctorname = read.next()
                    appointment(doctorname)
                } else {
                    return
                }
            }
            list.add(Doctor(index.name, index.id, index.specialization, index.availabilityTime, index.appointment + 1))
            continue
        }
        list.add(index)
    }
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), list)

}

//Specialization and Famous doctor in the clinique
fun popular() {
    var readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (rowIndex in 0 until readJsonValue.size - 1) {
        for (columnIndex in rowIndex + 1 until readJsonValue.size) {
            var firstString = readJsonValue[rowIndex].appointment
            var secondString = readJsonValue[columnIndex].appointment
            if (firstString > secondString) {
                var temp = readJsonValue[rowIndex]
                readJsonValue[rowIndex] = readJsonValue[columnIndex]
                readJsonValue[columnIndex] = temp
            }
        }
    }
    println()
    for (index in readJsonValue) {
        println("Best doctor in the clinique is ${index.name}")
        println("Best specialization in the clinique is ${index.specialization}")
        return
    }
}

//Add patient
fun addPatient() {
    var list = ArrayList<Patient>()
    val readJsonValue: Array<Patient> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Patient.json"), Array<Patient>::class.java)
    for (index in readJsonValue) {
        list.add(index)
    }
    val read = Scanner(System.`in`)
    println("Enter the PatientName")
    val name = read.next()
    println("Enter the Id")
    val id = read.nextInt()
    println("Enter the MobileNumber")
    val mobileNumber = read.nextLong()
    println("Enter the Age")
    val age = read.nextInt()
    println("Enter the Appointment")
    val appointment = read.nextInt()
    println("Enter the DoctorName")
    val doctorName = read.next()
    list.add(Patient(name, id, mobileNumber, age, appointment, doctorName))
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Patient.json"), list)
}

//Add Doctor
fun addDoctor() {
    var list = ArrayList<Doctor>()
    val readJsonValue: Array<Doctor> = objectmapper.readValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), Array<Doctor>::class.java)
    for (index in readJsonValue) {
        list.add(index)
    }
    val read = Scanner(System.`in`)
    println("Enter the DoctorName")
    val name = read.next()
    println("Enter the Id")
    val id = read.nextInt()
    println("Enter the specialization")
    val specialization = read.next()
    println("Enter the availabilityTime")
    val availabilityTime = read.nextDouble()
    println("Enter the appointment")
    val appointment = read.nextInt()
    list.add(Doctor(name, id, specialization, availabilityTime, appointment))
    objectmapper.writeValue(File("C:\\Users\\prashanth\\IdeaProjects\\Kotlinprograms\\src\\Doctor.json"), list)
}

fun main() {
    var read = Scanner(System.`in`)
    println("Searching for the Doctor")
    println("Choose in the upcoming values\nPress1 to Add Patient \nPress2 to Add Doctor" +
            "\nPress3 to Search By Doctor Name \nPress4 to Search By DoctorId \npress5 to Search By Doctor Specialization" +
            "\nPress6 to Search By Doctor Availability")
    val temp = read.nextInt()
    when (temp) {
        1 -> addPatient()
        2 -> addDoctor()
        3 -> {
            println("Enter the Doctor name")
            var name=read.next()
            searchByDoctorName(name)
        }
        4 -> {
            println("Enter the Doctor Id")
            var id=read.nextInt()
            searchByDoctorId(id)
        }
        5 -> {
            println("Enter the Doctor Specialization")
            var specialization=read.next()
            searchByDoctorSpecialization(specialization)
        }
        6 -> {
            println("Enter  the Doctor AvailabilityTime")
            var availabilityTime=read.nextDouble()
            searchByDoctorAvailability(availabilityTime)
        }

    }
    println("Searching for Patient")
    println("Choose in the upcoming values\nPress1 for Search By Patient name \nPress2 for Search By Patient Mobile" +
            "\nPress-3 for Search By Patient Id \nPress4 for terminate ")
    val patient = read.nextInt()
    when (patient) {
        1 -> {
            println("Enter Patient name")
            var name=read.next()
            searchByPatientname(name)
        }
        2 -> {
            println("Enter Patient MobileNumber")
            var mobileNumber=read.nextLong()
            searchByPatientMobile(mobileNumber)
        }
        3 -> {
            println("Enter Patient Id")
            var id=read.nextInt()
            searchByPatientId(id)
        }
        4 -> println("Thank You")

    }
    println("Press1 if you want to take an appointment or Press0")
    var appointment= read.nextInt()
    if (appointment == 1) {
        println("Enter the Doctor's name")
        var name=read.next()
        appointment(name)
    } else println("Sorry! You are not taken any appointment")
    popular()
}
