package com.Clinique

class Doctor {
    var name: String? = null
    var id = 0
    var specialization: String? = null
    var availabilityTime: Double = 0.0
    var appointment: Int = 0

    constructor(name: String?, id: Int, specialization: String?, availabilityTime: Double,appointment: Int) {
        this.name = name
        this.id = id
        this.specialization = specialization
        this.availabilityTime = availabilityTime
        this.appointment = appointment
    }

    override fun toString(): String {
        return "[name=$name, id=$id, specialization=$specialization, availabilityTime=$availabilityTime, appointment=$appointment]"
    }
}