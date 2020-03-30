package com.AddressBook

class AddressBook {
    var firstName : String? = null
    var lastName : String? = null
    var city : String? = null
    var state : String? = null
    var phoneNumber : Long = 0
    var streetName: String? = null
    var area : String? = null
    var zip: Long = 0

    constructor(firstName: String, lastName: String, city: String, state: String, phoneNumber: Long, streetName: String,area : String,zip: Long) {
        this.firstName = firstName
        this.lastName = lastName
        this.city = city
        this.state = state
        this.phoneNumber = phoneNumber
        this.streetName = streetName
        this.area = area
        this.zip = zip
    }

    override fun toString(): String {
        return "[FirstName: $firstName , LastName: $lastName, City: $city, " +
                "State: $state, PhoneNumber: $phoneNumber, StreetName: $streetName, Area : $area, zip: $zip]"
    }
}
