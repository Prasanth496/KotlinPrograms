package com.designpatterns.behavioural.Observer


open class MobileShop {
    public var model: String? = null
    private var avaialblity: Boolean? = null
    var value : Boolean ?= null
    private var customers: List<CustomerImpl> = List<CustomerImpl>()

    private fun <T> List(size: Boolean.Companion): List<CustomerImpl> {
    }


    constructor(model: String) {
        this.model = model
    }


    // this method is for checking the availablity of the mobile
    fun Availability() {
        fun get(): Boolean? {
            return this.avaialblity
        }

        fun set() : Boolean?{
            if (this.avaialblity != value)
            {
                this.avaialblity = value
                this.notify()
            }
        }
    }

    private fun MobileShop.notify() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


