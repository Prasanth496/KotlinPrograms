package com.designpatterns.creational.Prototype

class Address : Cloneable
{
    var city : String
    var state : String
    var country : String
    constructor(city : String,state : String,country : String)
    {
        this.city = city
        this.state = state
        this.country = country
    }

    object Clone(cloneable: Cloneable) {
        return this.cloneable()
    }
    override fun toString() : String
    {
        return String.format("City: {0}\t\tState: {1}\tCountry: {2}\n ${this.city}, ${this.state}, ${this.country}")

    }
}

