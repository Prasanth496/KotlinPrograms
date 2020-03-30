package com.Clinique

class Patient
{
    var name: String? = null
    var id = 0
    var mobileNumber: Long = 0
    var age: Int = 0
    var appointment: Int = 0
    var doctorName: String? = null


    constructor(name: String?, id: Int, mobileNumber: Long, age: Int, appointment: Int, doctorName: String) {
        this.name = name
        this.id = id
        this.mobileNumber = mobileNumber
        this.age = age
        this.appointment = appointment
        this.doctorName = doctorName
    }

    override fun toString(): String {
        return "[name=$name, id=$id, mobileNumber=$mobileNumber, age=$age, appointment=$appointment, doctorName=$doctorName]"
    }
}
