package com.designpatterns.behavoiural.Visitor

public class Book : ItemElement<Any?> {
    private var price : Int ?= null
    private var isbnNumber : String ?= null


    // initializing the variables throw the constructor
    constructor(price : Int, isbn : String)
    {
        this.price = price
        this.isbnNumber = isbn
    }
    fun GetPrice() {
         fun get(): Int? {
            return this.price
        }
    }
    fun GetIsbnNumber() {
        fun get(): String? {
            return this.isbnNumber
        }
    }

    // this is the implemented method which has potential to iterate through the code without changing
    fun Accept(visitor : ShoppingCartVisitor) : Int
    {
        return visitor.visit(this)
    }
}