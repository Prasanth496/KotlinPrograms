package com.designpatterns.behavoiural.Visitor

public class Fruit : ItemElement<Any?> {
    private var pricePerKg : Int ?= null
    private var weight : Int ?= null
    private var name : String ?= null


    // constructor for initialization
    constructor(price : Int, weight : Int,name : String)
    {
        this.pricePerKg = price
        this.weight = weight
        this.name = name
    }


    // this property is to make the fields available in the vistorimplimentation
    fun GetPricePerKg()
    {
         fun get(): Int? {
            return this.pricePerKg
        }
    }
    fun GetWeight() {
        fun get(): Int? {
            return this.weight
        }
    }
    fun GetName() {
        fun get(): String? {
            return this.name
        }
    }


    //  implemented method from the Parent interface
    fun Accept(visitor : ShoppingCartVisitor) : Int
    {
        return visitor.visit(this)
    }
}