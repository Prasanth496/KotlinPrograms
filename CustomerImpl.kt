package com.designpatterns.behavioural.Observer

public class CustomerImpl : Customer
{

    // Customer name
    private var name : String ?= null


    //  initializing the Customer name using the Constructor
    constructor(name : String)
    {
        this.name = name
    }


    //  this is used to update the customers about the mobile phones availablity
    fun Update(shop : MobileShop) {
        var format : String = "Hello, {0} {1} is available for Purchase"
        println(format,this.name,shop.model)
    }

    private fun println(format: String, name: String?, model: Any) {

    }

}